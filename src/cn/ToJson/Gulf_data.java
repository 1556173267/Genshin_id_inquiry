package cn.ToJson;


public class Gulf_data{
	public int index;//关卡数
	public int  star;//获得星星数
	public int[] floor_index;//层数
	public int[] floor_star;//层数对应获得星星数
	public String[] data;	//每层数据占一个String,其中上下层用@分割，其他用;分割
	
	public Gulf_data(int floor_index_length) {
		this.floor_index = new int[floor_index_length];
		this.floor_star = new int[floor_index_length];
		this.data = new String[floor_index_length];
	}
}
