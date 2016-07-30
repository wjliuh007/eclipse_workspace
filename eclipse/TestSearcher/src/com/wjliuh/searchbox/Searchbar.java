package com.wjliuh.searchbox;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;

import com.wjliuh.index.IndexingConfig;
import com.wjliuh.itf.ISearchHandler;
import com.wjliuh.model.ResultTableModel;
import com.wjliuh.result.SearchResult;

public class Searchbar extends JPanel implements ISearchHandler{

	private static final long serialVersionUID = 2262247891533198386L;
	
	private SearcherBox scb;
	
	private JButton button;
	
	private JTable contentTable;
	
	private ResultTableModel model;
	
	public Searchbar(){
		
		this.setLayout(new BorderLayout());
		scb = getComboBox();
		button = getSearchBtn();	
		
		this.add(scb,BorderLayout.CENTER);
		this.add(button,BorderLayout.EAST);
	}
	
	private JButton getSearchBtn() {
		JButton btn = new SearchBtn(this);
		return btn;
	}

	private SearcherBox getComboBox(){
		SearchComBox<String> scb = new SearchComBox<String>(this);
		scb.addItem("");
		scb.addItem("adfasdf");
		scb.addItem("agbh");
		scb.addItem("234yhh");
		scb.setEditable(true);
		return new SearcherBox(this);
	}

	public JTable getContentTable() {
		return contentTable;
	}

	public void setContentTable(JTable contentTable) {
		this.contentTable = contentTable;
		setModel((ResultTableModel)contentTable.getModel());
	}

	public ResultTableModel getModel() {
		return model;
	}

	public void setModel(ResultTableModel model) {
		this.model = model;
	}

	@Override
	public void handlerEvent(ActionEvent e) throws Exception {
		if(contentTable==null || model ==null){
			return;
		}
		
		doQuery();
		// 检索索引
//		contentTable.setModel(this.model);
		
	}

	private void doQuery() {
		String keyWords = scb.getText();
		
		if(null == keyWords || "".equals(keyWords)){
			return;
		}
		// 5根据searcher
		try {
			List<SearchResult> result = IndexingConfig.searcher(keyWords);
			this.model.setVos(result);
			this.model.fireTableDataChanged();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
