package zdoctor.zcoremod.map.minecraft.world.gen.structure.template;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Template$BlockInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcj$b";
		else
			return "net/minecraft/world/gen/structure/template/Template$BlockInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcj$b";
		else
			return "Template$BlockInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcj$b;";
		else
			return "Lnet/minecraft/world/gen/structure/template/Template$BlockInfo;";
	}

	/**
	 * <p>
	 * Name: pos
	 * </p>
	 */
	public static McObfPair field_186242_a = McMappingDatabase.getSRG("field_186242_a");

	/**
	 * <p>
	 * Name: tileentityData
	 * </p>
	 */
	public static McObfPair field_186244_c = McMappingDatabase.getSRG("field_186244_c");

	/**
	 * <p>
	 * Name: blockState
	 * </p>
	 */
	public static McObfPair field_186243_b = McMappingDatabase.getSRG("field_186243_b");

}
