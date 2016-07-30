/*******************************************************************************
 * Copyright (c) 2010 Andreas Kalender All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Andreas Kalender -
 * initial API and implementation
 *******************************************************************************/

package net.sourceforge.docfetcher.webinterface.managedBeans;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.model.SelectItem;

import net.sourceforge.docfetcher.enumeration.Filesize;
import net.sourceforge.docfetcher.model.ResultDocument;
import net.sourceforge.docfetcher.model.RootScope;
import net.sourceforge.docfetcher.model.ScopeRegistry;
import net.sourceforge.docfetcher.model.ScopeRegistry.SearchException;
import net.sourceforge.docfetcher.parse.Parser;
import net.sourceforge.docfetcher.parse.ParserRegistry;
import net.sourceforge.docfetcher.util.UtilFile;
import edu.emory.mathcs.backport.java.util.Collections;

/**
 * A java bean that encapsulates the data that is used for a search request by
 * the webinterface
 * 
 * @author Andreas Kalender
 */
public class DocFetcherSearchBean {

	private static final String FORWARD_WITH_TABLE = "submit"; //$NON-NLS-1$

	private final SelectItem[] fileSizeItems;
	private int maxFileSize;
	private String maxFileSizeUnit;
	private int minFileSize;
	private String minFileSizeUnit;
	private final List<SearchResultBean> result;
	private String searchString;
	private String sortColumnName;
	private boolean sortOrderDescending;

	/**
	 * Constructor
	 */
	public DocFetcherSearchBean() {
		this.result = new ArrayList<SearchResultBean>();
		this.fileSizeItems = this.createFileSizeItems();
	}

	/**
	 * Creates the <code>SelectItems</code> that could be choosen to filter the
	 * search results by size
	 * 
	 * @return An array containing the items that could be chosen
	 */
	protected SelectItem[] createFileSizeItems() {
		final Filesize[] values = Filesize.values();
		final SelectItem[] result = new SelectItem[values.length];

		final String[] valuesAsString = Filesize.valuesAsStrings();

		for (int i = 0; i < Filesize.values().length; i++) {
			result[i] = new SelectItem(valuesAsString[i]);
		}

		return result;
	}

	/**
	 * TODO Extract this method into a new and independent class (original code
	 * was taken from net.sourceforge.docfetcher.view.ResultPanel.ParserFilter)
	 * 
	 * @param results
	 *            The results without filtering
	 * @return The list of the elements that are selected by the checked file
	 *         type filters
	 */
	protected List<ResultDocument> filterDocuments(final ResultDocument[] results) {
		final Map<String, Boolean> checkStates = new HashMap<String, Boolean>();
		for (final Parser parser : ParserRegistry.getParsers()) {
			checkStates.put(parser	.getClass()
									.getSimpleName(),
							parser.isChecked());
		}

		final List<ResultDocument> selected = new ArrayList<ResultDocument>(results.length);
		for (final ResultDocument doc : results) {
			final Boolean checkState = checkStates.get(doc.getParserName());
			if ((checkState != null) && checkState) {
				selected.add(doc);
			}
		}

		return selected;
	}

	/**
	 * Getter
	 * 
	 * @return The maxFileSize
	 */
	public int getMaxFileSize() {
		return this.maxFileSize;
	}

	/**
	 * Getter
	 * 
	 * @return The maxFileSizeUnit
	 */
	public String getMaxFileSizeUnit() {
		return this.maxFileSizeUnit;
	}

	/**
	 * Getter
	 * 
	 * @return The minFileSize
	 */
	public int getMinFileSize() {
		return this.minFileSize;
	}

	/**
	 * Getter
	 * 
	 * @return The minFileSizeUnit
	 */
	public String getMinFileSizeUnit() {
		return this.minFileSizeUnit;
	}

	/**
	 * Returns a list of the available parser
	 * 
	 * @return A list of the supported parser
	 */
	public List<FileTypeBean> getParser() {
		final List<FileTypeBean> result = new ArrayList<FileTypeBean>();

		// Creates one instance of the <code>FileTypeBean</code> per
		// parser
		final FileTypeBeanFactory factory = FileTypeBeanFactory.getInstance();

		for (final Parser parser : ParserRegistry.getParsers()) {
			final FileTypeBean bean = factory.getOrCreateFileTypeBean(parser);

			result.add(bean);
		}

		// Sorts the list of given parsers in alphabetic order
		Collections.sort(result);

		return result;
	}

	/**
	 * Getter
	 * 
	 * @return The result corresponding to the given search string
	 */
	public List<SearchResultBean> getResult() {
		this.result.clear();

		try {
			final List<RootScope> selectedScopes = RegisteredScopeBeanFactory	.getInstance()
																				.getAllSelectedScopes();

			if ((this.searchString != null) && !this.searchString	.trim()
																	.equals("") && (selectedScopes.size() > 0)) { //$NON-NLS-1$				
				final ResultDocument[] results = ScopeRegistry	.getInstance()
																.search(this.searchString,
																		selectedScopes);

				final List<ResultDocument> selected = this.filterDocuments(results);

				// TODO Validate filesizes
				final boolean filterBySize = (this.getMinFileSize() != 0) && (this.getMaxFileSize() != 0);

				long minFileSize = 0;
				long maxFileSize = 0;

				if (filterBySize) {
					minFileSize = Filesize.KB.convert(	this.getMinFileSize(),
														Filesize.valueOf(this.getMinFileSizeUnit()));
					maxFileSize = Filesize.KB.convert(	this.getMaxFileSize(),
														Filesize.valueOf(this.getMaxFileSizeUnit()));
				}

				for (final ResultDocument document : selected) {
					final SearchResultBean bean = new SearchResultBean(document);

					if (filterBySize) {
						final long fileSize = UtilFile.getSizeInKB(document.getFile());
						if ((fileSize >= minFileSize) && (fileSize <= maxFileSize)) {

							this.result.add(bean);
						}
					}

					else {
						this.result.add(bean);
					}
				}
			}
		}
		catch (final SearchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return this.sortResults(this.result);
	}

	/**
	 * Getter
	 * 
	 * @return the searchString
	 */
	public String getSearchString() {
		return this.searchString;
	}

	/**
	 * Getter
	 * 
	 * @return The selectableItems
	 */
	public SelectItem[] getSelectableItems() {
		return this.fileSizeItems;
	}

	/**
	 * Getter
	 * 
	 * @return The sortColumnName
	 */
	public String getSortColumnName() {
		return this.sortColumnName;
	}

	/**
	 * Getter
	 * 
	 * @return The sortOrderDescending
	 */
	public boolean isSortOrderDescending() {
		return this.sortOrderDescending;
	}

	/**
	 * Setter
	 * 
	 * @param maxFileSize
	 *            The maxFileSize to set
	 */
	public void setMaxFileSize(final int maxFileSize) {
		this.maxFileSize = maxFileSize;
	}

	/**
	 * Setter
	 * 
	 * @param maxFileSizeUnit
	 *            The maxFileSizeUnit to set
	 */
	public void setMaxFileSizeUnit(final String maxFileSizeUnit) {
		this.maxFileSizeUnit = maxFileSizeUnit;
	}

	/**
	 * Setter
	 * 
	 * @param minFileSize
	 *            The minFileSize to set
	 */
	public void setMinFileSize(final int minFileSize) {
		this.minFileSize = minFileSize;
	}

	/**
	 * Setter
	 * 
	 * @param minFileSizeUnit
	 *            The minFileSizeUnit to set
	 */
	public void setMinFileSizeUnit(final String minFileSizeUnit) {
		this.minFileSizeUnit = minFileSizeUnit;
	}

	/**
	 * Getter
	 * 
	 * @param searchString
	 *            the searchString to set
	 */
	public void setSearchString(final String searchString) {
		this.searchString = searchString;
	}

	/**
	 * Setter
	 * 
	 * @param sortColumnName
	 *            The sortColumnName to set
	 */
	public void setSortColumnName(final String sortColumnName) {
		this.sortColumnName = sortColumnName;
	}

	/**
	 * Setter
	 * 
	 * @param sortOrderDescending
	 *            The sortOrderDescending to set
	 */
	public void setSortOrderDescending(final boolean sortOrderDescending) {
		this.sortOrderDescending = sortOrderDescending;
	}

	/**
	 * Returns the results ordered ascending or descending by a given column
	 * 
	 * @param result
	 *            The unsorted list of the search results
	 * @return The ordered list of the search results
	 */
	protected List<SearchResultBean> sortResults(final List<SearchResultBean> result) {
		if (this.getSortColumnName() != null) {
			final Comparator<SearchResultBean> comparator = SearchResultComparatorFactory	.getInstance()
																							.getComparator(	this.getSortColumnName(),
																											this.isSortOrderDescending());

			if (comparator != null) {
				Collections.sort(	result,
									comparator);
			}
		}

		return result;
	}

	/**
	 * Returns the string that is used for the navigation rule
	 * 
	 * @return The string that is used for the evaluation of the navigation rule
	 */
	public String startSearch() {
		return DocFetcherSearchBean.FORWARD_WITH_TABLE;
	}
}
