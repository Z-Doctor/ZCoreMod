package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureEndCityPieces$IGenerator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbi$b";
		else
			return "net/minecraft/world/gen/structure/StructureEndCityPieces$IGenerator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbi$b";
		else
			return "StructureEndCityPieces$IGenerator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbi$b;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureEndCityPieces$IGenerator;";
	}

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186184_a = McMappingDatabase.getSRG("StructureEndCityPieces$IGenerator.func_186184_a");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z]
	 * </p>
	 */
	public static McObfPair func_191086_a = McMappingDatabase.getSRG("StructureEndCityPieces$IGenerator.func_191086_a");

}
