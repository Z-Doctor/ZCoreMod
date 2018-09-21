package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityBodyHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wl";
		else
			return "net/minecraft/entity/EntityBodyHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wl";
		else
			return "EntityBodyHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lwl;";
		else
			return "Lnet/minecraft/entity/EntityBodyHelper;";
	}

	/**
	 * <p>
	 * Name: computeAngleWithBound
	 * </p>
	 * <p>
	 * Desc: [(FFF)F]
	 * </p>
	 */
	public static McObfPair func_75665_a = McMappingDatabase.getSRG("EntityBodyHelper.func_75665_a");

	/**
	 * <p>
	 * Name: updateRenderAngles
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75664_a = McMappingDatabase.getSRG("EntityBodyHelper.func_75664_a");

	/**
	 * <p>
	 * Name: rotationTickCounter
	 * </p>
	 */
	public static McObfPair field_75666_b = McMappingDatabase.getSRG("field_75666_b");

	/**
	 * <p>
	 * Name: prevRenderYawHead
	 * </p>
	 */
	public static McObfPair field_75667_c = McMappingDatabase.getSRG("field_75667_c");

	/**
	 * <p>
	 * Name: living
	 * </p>
	 */
	public static McObfPair field_75668_a = McMappingDatabase.getSRG("field_75668_a");

}
