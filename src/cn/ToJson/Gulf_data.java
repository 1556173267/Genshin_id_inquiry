package cn.ToJson;


public class Gulf_data{
	public int index;//�ؿ���
	public int  star;//���������
	public int[] floor_index;//����
	public int[] floor_star;//������Ӧ���������
	public String[] data;	//ÿ������ռһ��String,�������²���@�ָ������;�ָ�
	
	public Gulf_data(int floor_index_length) {
		this.floor_index = new int[floor_index_length];
		this.floor_star = new int[floor_index_length];
		this.data = new String[floor_index_length];
	}
}
