package com.wjliuh.parser;

import java.awt.Component;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class GroupLayoutUI extends JFrame {
	private JScrollPane scrollPane;
	private JList list;
	private DefaultListModel listModel;
	public GroupLayoutUI() throws Exception {
		
		scrollPane = new JScrollPane();
		list = new JList();
		listModel = new DefaultListModel();
		scrollPane.setViewportView(list);
		list.setModel(listModel);
		list.setCellRenderer(new Rendor());
		list.addListSelectionListener(new ListSelectionListener(){

			@Override
			public void valueChanged(ListSelectionEvent e) {
				processValueChanged(e);
				
			}
			
		});
		Document doc = Jsoup.connect("http://club.autohome.com.cn/bbs/forum-o-200042-2.html?qaType=-1#pvareaid=101061").get();
		Elements divs = doc.select("dt");
		
		for(Element el:divs){
			if(el.children().size()==3){
				String title = el.children().get(1).html();
				String url = el.children().get(1).absUrl("href");
				if(null == title || title.length()==0){
					continue;
				}
				LinkLabel ll = new LinkLabel(title, url);
				listModel.addElement(ll);
			}

			
		}
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
		setSize(642, 416);

	}

	protected void processValueChanged(ListSelectionEvent evt) {
        if (evt.getValueIsAdjusting() || list.isSelectionEmpty()) {
            return;
        }
        int selectedIndex = list.getSelectedIndex();
        if (selectedIndex >= 0) {
            LinkLabel info = (LinkLabel) list.getSelectedValue();
            try {
				Desktop.getDesktop().browse(new java.net.URI(info.getUrl()));
			} catch (IOException e) {
				e.printStackTrace();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
        }
		
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		GroupLayoutUI ui = new GroupLayoutUI();
		ui.setVisible(true);
	}


}
class Rendor extends DefaultListCellRenderer {

	@Override
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {
		LinkLabel l = (LinkLabel)value;
		String text = l.getTitle();
		setText(text);
        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        return this;
	}
	
}