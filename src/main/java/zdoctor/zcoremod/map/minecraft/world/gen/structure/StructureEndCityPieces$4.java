package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureEndCityPieces$4 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbi$4";
		else
			return "net/minecraft/world/gen/structure/StructureEndCityPieces$4";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbi$4";
		else
			return "StructureEndCityPieces$4";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbi$4;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureEndCityPieces$4;";
	}

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186184_a = McMappingDatabase.getSRG("StructureEndCityPieces$4.func_186184_a");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z]
	 * </p>
	 */
	public static McObfPair func_191086_a = McMappingDatabase.getSRG("StructureEndCityPieces$4.func_191086_a");

}
