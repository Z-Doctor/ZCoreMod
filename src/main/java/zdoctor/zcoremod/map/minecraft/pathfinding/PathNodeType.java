package zdoctor.zcoremod.map.minecraft.pathfinding;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PathNodeType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "beh";
		else
			return "net/minecraft/pathfinding/PathNodeType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "beh";
		else
			return "PathNodeType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbeh;";
		else
			return "Lnet/minecraft/pathfinding/PathNodeType;";
	}

	/**
	 * <p>
	 * Name: priority
	 * </p>
	 */
	public static McObfPair field_186307_r = McMappingDatabase.getSRG("field_186307_r");

	/**
	 * <p>
	 * Name: getPriority
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_186289_a = McMappingDatabase.getSRG("PathNodeType.func_186289_a");

}
