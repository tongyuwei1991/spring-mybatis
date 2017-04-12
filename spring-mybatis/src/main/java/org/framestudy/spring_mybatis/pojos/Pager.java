package org.framestudy.spring_mybatis.pojos;

import java.util.List;

public class Pager {
	private int page;
	private int rows;
	private int index;//其实位置
	
	private int totalRows;
	private int totalPage;
	private List<?> datas;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<?> getDatas() {
		return datas;
	}
	public void setDatas(List<?> datas) {
		this.datas = datas;
	}
	public Pager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pager(int totalRows, List<?> datas) {
		super();
		this.totalRows = totalRows;
		this.datas = datas;
	}
	@Override
	public String toString() {
		return "Pager [page=" + page + ", rows=" + rows + ", index=" + index + ", totalRows=" + totalRows
				+ ", totalPage=" + totalPage + ", datas=" + datas + "]";
	}
	
}
