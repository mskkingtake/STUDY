package designPatterns.singleton;

public enum Persion5 {
	
	// ö��ԭʼ������ǵ���ģʽ
	INSTANCE;
	
	public void SingletonOperate() {
		
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
