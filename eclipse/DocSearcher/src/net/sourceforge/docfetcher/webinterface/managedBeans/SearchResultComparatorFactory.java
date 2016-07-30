/*******************************************************************************
 * Copyright (c) 2010 Andreas Kalender
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andreas Kalender - initial API and implementation
 *******************************************************************************/

package net.sourceforge.docfetcher.webinterface.managedBeans;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Factory Pattern The factory could be used to create an implementation of the
 * <code>Comparator</code> interface. The implementation will offer an order
 * based upon a given columnname and could be choosen either ascending or
 * descending
 * 
 * @author Andreas Kalender
 */
public class SearchResultComparatorFactory {

	private static SearchResultComparatorFactory instance;

	/**
	 * Factory Pattern, Singleton Pattern
	 * 
	 * @return An instance of this class
	 */
	public static SearchResultComparatorFactory getInstance() {
		if (SearchResultComparatorFactory.instance == null) {
			SearchResultComparatorFactory.instance = new SearchResultComparatorFactory();
		}

		return SearchResultComparatorFactory.instance;
	}

	private final Map<String, Comparator<SearchResultBean>> ascendingComparators;
	private final Map<String, Comparator<SearchResultBean>> descendingComparators;

	/**
	 * Constructor Initializes the maps by putting one ascending and one
	 * descending comparotor per table header into the corresponding map
	 */
	protected SearchResultComparatorFactory() {
		this.ascendingComparators = new TreeMap<String, Comparator<SearchResultBean>>();
		this.descendingComparators = new TreeMap<String, Comparator<SearchResultBean>>();

		// Inserts the comparator for the author
		this.ascendingComparators.put(	SearchResultHeaders	.getInstance()
															.getHeaderAuthor(),
										this.getAuthorComparatorAscending());
		this.descendingComparators.put(	SearchResultHeaders	.getInstance()
															.getHeaderTitle(),
										this.getAuthorComparatorDescending());

		// Inserts the comparator for the date of last modification
		this.ascendingComparators.put(	SearchResultHeaders	.getInstance()
															.getHeaderLastModified(),
										this.getLastModifiedComparatorAscending());
		this.descendingComparators.put(	SearchResultHeaders	.getInstance()
															.getHeaderTitle(),
										this.getLastModifiedComparatorDescending());

		// Inserts the comparator for the filename
		this.ascendingComparators.put(	SearchResultHeaders	.getInstance()
															.getHeaderName(),
										this.getNameComparatorAscending());
		this.descendingComparators.put(	SearchResultHeaders	.getInstance()
															.getHeaderName(),
										this.getNameComparatorDescending());

		// Inserts the comparator for the path
		this.ascendingComparators.put(	SearchResultHeaders	.getInstance()
															.getHeaderPath(),
										this.getPathComparatorAscending()

		);
		this.descendingComparators.put(	SearchResultHeaders	.getInstance()
															.getHeaderPath(),
										this.getPathComparatorDescending()

		);

		// Inserts the comparator for the path
		this.ascendingComparators.put(	SearchResultHeaders	.getInstance()
															.getHeaderScore(),
										this.getScoreComparatorAscending()

		);
		this.descendingComparators.put(	SearchResultHeaders	.getInstance()
															.getHeaderScore(),
										this.getScoreComparatorDescending()

		);

		// Inserts the comparator for the size
		this.ascendingComparators.put(	SearchResultHeaders	.getInstance()
															.getHeaderSize(),
										this.getSizeComparatorAscending()

		);
		this.descendingComparators.put(	SearchResultHeaders	.getInstance()
															.getHeaderSize(),
										this.getSizeComparatorDescending()

		);

		// Inserts the comparator for the title
		this.ascendingComparators.put(	SearchResultHeaders	.getInstance()
															.getHeaderTitle(),
										this.getTitleComparatorAscending());
		this.descendingComparators.put(	SearchResultHeaders	.getInstance()
															.getHeaderTitle(),
										this.getTitleComparatorDescending());

		// Inserts the comparator for the type of the file
		this.ascendingComparators.put(	SearchResultHeaders	.getInstance()
															.getHeaderType(),
										this.getTypeComparatorAscending());
		this.descendingComparators.put(	SearchResultHeaders	.getInstance()
															.getHeaderType(),
										this.getTypeComparatorDescending());

	}

	/**
	 * Creates a new <code>Comparator</code> that provides an ascending order of
	 * the <code>SearchResultBeans</code> by the author
	 * 
	 * @return The created <code>Comparator</code>
	 */
	protected Comparator<SearchResultBean> getAuthorComparatorAscending() {
		return new Comparator<SearchResultBean>() {

			public int compare(	final SearchResultBean o1,
								final SearchResultBean o2) {
				if (o1 == null) {
					return 1;
				}

				if (o2 == null) {
					return -1;
				}

				return o2	.getAuthor()
							.compareTo(o1.getAuthor());
			}
		};
	}

	/**
	 * Creates a new <code>Comparator</code> that provides an descending order
	 * of the <code>SearchResultBeans</code> by the author
	 * 
	 * @return The created <code>Comparator</code>
	 */
	protected Comparator<SearchResultBean> getAuthorComparatorDescending() {
		return new Comparator<SearchResultBean>() {

			public int compare(	final SearchResultBean o1,
								final SearchResultBean o2) {
				if (o1 == null) {
					return -1;
				}

				if (o2 == null) {
					return 1;
				}

				return o1	.getAuthor()
							.compareTo(o2.getAuthor());
			}
		};
	}

	/**
	 * Creates a comparator to the given columnheader and sorting order
	 * 
	 * @param columnHeader
	 *            The column header that determines the order
	 * @param descending
	 *            If true, the order is descending (ascending otherwise
	 * @return The corresponding comparator
	 */
	public Comparator<SearchResultBean> getComparator(	final String columnHeader,
														final boolean descending) {
		if (!descending) {
			return this.ascendingComparators.get(columnHeader);
		}

		return this.descendingComparators.get(columnHeader);
	}

	/**
	 * Creates a new <code>Comparator</code> that provides an ascending order of
	 * the <code>SearchResultBeans</code> by the date of last modification
	 * 
	 * @return The created <code>Comparator</code>
	 */
	protected Comparator<SearchResultBean> getLastModifiedComparatorAscending() {
		return new Comparator<SearchResultBean>() {

			public int compare(	final SearchResultBean o1,
								final SearchResultBean o2) {
				if (o1 == null) {
					return 1;
				}

				if (o2 == null) {
					return -1;
				}

				return o2	.getLastModified()
							.compareTo(o1.getLastModified());
			}
		};
	}

	/**
	 * Creates a new <code>Comparator</code> that provides an descending order
	 * of the <code>SearchResultBeans</code> by the date of last modification
	 * 
	 * @return The created <code>Comparator</code>
	 */
	protected Comparator<SearchResultBean> getLastModifiedComparatorDescending() {
		return new Comparator<SearchResultBean>() {

			public int compare(	final SearchResultBean o1,
								final SearchResultBean o2) {
				if (o1 == null) {
					return -1;
				}

				if (o2 == null) {
					return 1;
				}

				return o1	.getLastModified()
							.compareTo(o2.getLastModified());
			}
		};
	}

	/**
	 * Creates a new <code>Comparator</code> that provides an ascending order of
	 * the <code>SearchResultBeans</code> by the name
	 * 
	 * @return The created <code>Comparator</code>
	 */
	protected Comparator<SearchResultBean> getNameComparatorAscending() {
		return new Comparator<SearchResultBean>() {

			public int compare(	final SearchResultBean o1,
								final SearchResultBean o2) {
				if (o1 == null) {
					return 1;
				}

				if (o2 == null) {
					return -1;
				}

				return o2	.getFileName()
							.compareTo(o1.getFileName());
			}
		};
	}

	/**
	 * Creates a new <code>Comparator</code> that provides an descending order
	 * of the <code>SearchResultBeans</code> by the name
	 * 
	 * @return The created <code>Comparator</code>
	 */
	protected Comparator<SearchResultBean> getNameComparatorDescending() {
		return new Comparator<SearchResultBean>() {

			public int compare(	final SearchResultBean o1,
								final SearchResultBean o2) {
				if (o1 == null) {
					return -1;
				}

				if (o2 == null) {
					return 1;
				}

				return o1	.getFileName()
							.compareTo(o2.getFileName());
			}
		};
	}

	/**
	 * Creates a new <code>Comparator</code> that provides an ascending order of
	 * the <code>SearchResultBeans</code> by the path
	 * 
	 * @return The created <code>Comparator</code>
	 */
	protected Comparator<SearchResultBean> getPathComparatorAscending() {
		return new Comparator<SearchResultBean>() {

			public int compare(	final SearchResultBean o1,
								final SearchResultBean o2) {
				if (o1 == null) {
					return 1;
				}

				if (o2 == null) {
					return -1;
				}

				return o2	.getPath()
							.compareTo(o1.getPath());
			}
		};
	}

	/**
	 * Creates a new <code>Comparator</code> that provides an descending order
	 * of the <code>SearchResultBeans</code> by the path
	 * 
	 * @return The created <code>Comparator</code>
	 */
	protected Comparator<SearchResultBean> getPathComparatorDescending() {
		return new Comparator<SearchResultBean>() {

			public int compare(	final SearchResultBean o1,
								final SearchResultBean o2) {
				if (o1 == null) {
					return -1;
				}

				if (o2 == null) {
					return 1;
				}

				return o1	.getPath()
							.compareTo(o2.getPath());
			}
		};
	}

	/**
	 * Creates a new <code>Comparator</code> that provides an ascending order of
	 * the <code>SearchResultBeans</code> by the score
	 * 
	 * @return The created <code>Comparator</code>
	 */
	protected Comparator<SearchResultBean> getScoreComparatorAscending() {
		return new Comparator<SearchResultBean>() {

			public int compare(	final SearchResultBean o1,
								final SearchResultBean o2) {
				if (o1 == null) {
					return 1;
				}

				if (o2 == null) {
					return -1;
				}

				return new Integer(o2.getScore()).compareTo(o1.getScore());
			}
		};
	}

	/**
	 * Creates a new <code>Comparator</code> that provides an descending order
	 * of the <code>SearchResultBeans</code> by the score
	 * 
	 * @return The created <code>Comparator</code>
	 */
	protected Comparator<SearchResultBean> getScoreComparatorDescending() {
		return new Comparator<SearchResultBean>() {

			public int compare(	final SearchResultBean o1,
								final SearchResultBean o2) {
				if (o1 == null) {
					return -1;
				}

				if (o2 == null) {
					return 1;
				}

				return new Integer(o1.getScore()).compareTo(o2.getScore());
			}
		};
	}

	/**
	 * Creates a new <code>Comparator</code> that provides an ascending order of
	 * the <code>SearchResultBeans</code> by the size of the files
	 * 
	 * @return The created <code>Comparator</code>
	 */
	protected Comparator<SearchResultBean> getSizeComparatorAscending() {
		return new Comparator<SearchResultBean>() {

			public int compare(	final SearchResultBean o1,
								final SearchResultBean o2) {
				if (o1 == null) {
					return 1;
				}

				if (o2 == null) {
					return -1;
				}
				return o2	.getSize()
							.compareTo(o1.getSize());
			}
		};
	}

	/**
	 * Creates a new <code>Comparator</code> that provides an descending order
	 * of the <code>SearchResultBeans</code> by the size of the files
	 * 
	 * @return The created <code>Comparator</code>
	 */
	protected Comparator<SearchResultBean> getSizeComparatorDescending() {
		return new Comparator<SearchResultBean>() {

			public int compare(	final SearchResultBean o1,
								final SearchResultBean o2) {
				if (o1 == null) {
					return -1;
				}

				if (o2 == null) {
					return 1;
				}

				return o1	.getSize()
							.compareTo(o2.getSize());
			}
		};
	}

	/**
	 * Creates a new <code>Comparator</code> that provides an ascending order of
	 * the <code>SearchResultBeans</code> by the title
	 * 
	 * @return The created <code>Comparator</code>
	 */
	protected Comparator<SearchResultBean> getTitleComparatorAscending() {
		return new Comparator<SearchResultBean>() {

			public int compare(	final SearchResultBean o1,
								final SearchResultBean o2) {
				if (o1 == null) {
					return 1;
				}

				if (o2 == null) {
					return -1;
				}

				return o2	.getTitle()
							.compareTo(o1.getTitle());
			}
		};
	}

	/**
	 * Creates a new <code>Comparator</code> that provides an descending order
	 * of the <code>SearchResultBeans</code> by the title
	 * 
	 * @return The created <code>Comparator</code>
	 */
	protected Comparator<SearchResultBean> getTitleComparatorDescending() {
		return new Comparator<SearchResultBean>() {

			public int compare(	final SearchResultBean o1,
								final SearchResultBean o2) {
				if (o1 == null) {
					return -1;
				}

				if (o2 == null) {
					return 1;
				}

				return o1	.getTitle()
							.compareTo(o2.getTitle());
			}
		};
	}

	/**
	 * Creates a new <code>Comparator</code> that provides an ascending order of
	 * the <code>SearchResultBeans</code> by the filetype
	 * 
	 * @return The created <code>Comparator</code>
	 */
	protected Comparator<SearchResultBean> getTypeComparatorAscending() {
		return new Comparator<SearchResultBean>() {

			public int compare(	final SearchResultBean o1,
								final SearchResultBean o2) {
				if (o1 == null) {
					return 1;
				}

				if (o2 == null) {
					return -1;
				}

				return o2	.getFileType()
							.compareTo(o1.getFileType());
			}
		};
	}

	/**
	 * Creates a new <code>Comparator</code> that provides an descending order
	 * of the <code>SearchResultBeans</code> by the filetype
	 * 
	 * @return The created <code>Comparator</code>
	 */
	protected Comparator<SearchResultBean> getTypeComparatorDescending() {
		return new Comparator<SearchResultBean>() {

			public int compare(	final SearchResultBean o1,
								final SearchResultBean o2) {
				if (o1 == null) {
					return -1;
				}

				if (o2 == null) {
					return 1;
				}

				return o1	.getFileType()
							.compareTo(o2.getFileType());
			}
		};
	}

}
