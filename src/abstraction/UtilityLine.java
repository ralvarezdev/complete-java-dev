package abstraction;

public class UtilityLine implements Mappable {
	private String name;
	private UtilityType utilityType;

	public UtilityLine(String name, UtilityType utilityType) {
		this.name = name;
		this.utilityType = utilityType;
	}

	@Override
	public String getLabel() {
		return name + " [" + utilityType + "]";
	}

	@Override
	public String getMarker() {
		return switch (utilityType) {
		case ELECTRICAL -> Color.YELLOW + " " + LineMarkers.DASHED;
		case GAS -> Color.GRAY + " " + LineMarkers.DASHED;
		case WATER -> Color.BLUE + " " + LineMarkers.SOLID;
		case FIBER_OPTIC -> Color.WHITE + " " + LineMarkers.SOLID;
		default -> Color.BLACK + " " + LineMarkers.DOTTED;
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
				""".formatted(name, utilityType);
	}
}
