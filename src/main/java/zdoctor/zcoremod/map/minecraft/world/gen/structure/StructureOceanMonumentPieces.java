package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureOceanMonumentPieces {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbp";
		else
			return "net/minecraft/world/gen/structure/StructureOceanMonumentPieces";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbp";
		else
			return "StructureOceanMonumentPieces";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbp;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces;";
	}

	/**
	 * <p>
	 * Name: registerOceanMonumentPieces
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175970_a = McMappingDatabase.getSRG("StructureOceanMonumentPieces.func_175970_a");

}
