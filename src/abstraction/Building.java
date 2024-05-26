package abstraction;

public class Building implements Mappable {
	private String name;
	private UsageType usageType;

	public Building(String name, UsageType usageType) {
		this.name = name;
		this.usageType = usageType;
	}

	@Override
	public String getLabel() {
		return name + " [" + usageType + "]";
	}

	@Override
	public String getMarker() {
		return switch (usageType) {
		case ENTERTAINMENT -> Color.GREEN + " " + PointMarkers.CIRCLE;
		case BUSINESS -> Color.BLUE + " " + PointMarkers.DIAMOND;
		case RESIDENTIAL -> Color.PURPLE + " " + PointMarkers.SQUARE;
		case GOVERNMENT -> Color.GRAY + " " + PointMarkers.SQUARE_ROUNDED;
		case SPORTS -> Color.YELLOW + " " + PointMarkers.TRIANGLE;
		default -> Color.BLACK + " " + PointMarkers.QUESTION_MARK;
		};
	}

	@Override
	public Geometry getShape() {
		return Geometry.POINT;
	}

	@Override
	public String toJSON() {
		return Mappable.super.toJSON() + """
				"name": "%s", "usage": "%s"
				""".formatted(name, usageType);
	}
}