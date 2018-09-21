package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureMineshaftStart {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbl";
		else
			return "net/minecraft/world/gen/structure/StructureMineshaftStart";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbl";
		else
			return "StructureMineshaftStart";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbl;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureMineshaftStart;";
	}

	/**
	 * <p>
	 * Name: mineShaftType
	 * </p>
	 */
	public static McObfPair field_189908_c = McMappingDatabase.getSRG("field_189908_c");

}
