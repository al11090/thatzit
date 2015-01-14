package thatzit;

public enum QuestionGenre
{
	GENERAL(0, "general"),
	MUSIC(1, "music");
	
	public static QuestionGenre getById(int id)
	{
		for (QuestionGenre element : values()) {
			if (element.getId() == id) return element;
		}
		throw new IllegalArgumentException("invalid enum range.");
	}
	
	private QuestionGenre(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public int getId() { return id; }
	public String getName() { return name; }
	
	private int id;
	private String name;
}
