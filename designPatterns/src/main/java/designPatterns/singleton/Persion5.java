package designPatterns.singleton;

public enum Persion5 {
	
	// 枚举原始本身就是单例模式
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
