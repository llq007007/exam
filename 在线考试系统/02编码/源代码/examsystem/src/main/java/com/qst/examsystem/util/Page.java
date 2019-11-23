package com.qst.examsystem.util;
import java.util.List;
public class Page<T> {   
	private int total;    // 总条数
	private int page;     // 当前页
	private int pageCount;//总页数
	private  int min;//当前板块最小页号(最左边)
	private  int max ;//当前板块最小页号(最右边)
	private int size=10;     // 每页数
	private List<T> rows; // 结果集
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPage() {
		return 0==total?1:page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public int getPageCount() {
		return 0==total%size?total/size:total/size+1;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getMin() {
		return 0==getPage()%5?getPage()-4:getPage()/5*5+1;
	}

	public void setMin(int min) {

		this.min =min;
	}

	public int getMax() {
		return getMin()+4;
	}

	public void setMax(int max) {
		this.max = max;
	}
}
