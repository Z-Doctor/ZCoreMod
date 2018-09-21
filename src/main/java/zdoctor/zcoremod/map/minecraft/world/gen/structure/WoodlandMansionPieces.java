package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WoodlandMansionPieces {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcd";
		else
			return "net/minecraft/world/gen/structure/WoodlandMansionPieces";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcd";
		else
			return "WoodlandMansionPieces";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcd;";
		else
			return "Lnet/minecraft/world/gen/structure/WoodlandMansionPieces;";
	}

	/**
	 * <p>
	 * Name: registerWoodlandMansionPieces
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_191153_a = McMappingDatabase.getSRG("WoodlandMansionPieces.func_191153_a");

	/**
	 * <p>
	 * Name: generateMansion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/template/TemplateManager;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/Rotation;Ljava/util/List;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_191152_a = McMappingDatabase.getSRG("WoodlandMansionPieces.func_191152_a");

}
