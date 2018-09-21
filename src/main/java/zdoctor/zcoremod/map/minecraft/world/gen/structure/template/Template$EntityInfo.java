package zdoctor.zcoremod.map.minecraft.world.gen.structure.template;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Template$EntityInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcj$c";
		else
			return "net/minecraft/world/gen/structure/template/Template$EntityInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcj$c";
		else
			return "Template$EntityInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcj$c;";
		else
			return "Lnet/minecraft/world/gen/structure/template/Template$EntityInfo;";
	}

	/**
	 * <p>
	 * Name: entityData
	 * </p>
	 */
	public static McObfPair field_186249_c = McMappingDatabase.getSRG("field_186249_c");

	/**
	 * <p>
	 * Name: pos
	 * </p>
	 */
	public static McObfPair field_186247_a = McMappingDatabase.getSRG("field_186247_a");

	/**
	 * <p>
	 * Name: blockPos
	 * </p>
	 */
	public static McObfPair field_186248_b = McMappingDatabase.getSRG("field_186248_b");

}
