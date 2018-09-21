package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureEndCityPieces {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbi";
		else
			return "net/minecraft/world/gen/structure/StructureEndCityPieces";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbi";
		else
			return "StructureEndCityPieces";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbi;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureEndCityPieces;";
	}

	/**
	 * <p>
	 * Name: TOWER_BRIDGE_GENERATOR
	 * </p>
	 */
	public static McObfPair field_186207_g = McMappingDatabase.getSRG("field_186207_g");

	/**
	 * <p>
	 * Name: FAT_TOWER_BRIDGES
	 * </p>
	 */
	public static McObfPair field_186208_h = McMappingDatabase.getSRG("field_186208_h");

	/**
	 * <p>
	 * Name: FAT_TOWER_GENERATOR
	 * </p>
	 */
	public static McObfPair field_186209_i = McMappingDatabase.getSRG("field_186209_i");

	/**
	 * <p>
	 * Name: INSERT
	 * </p>
	 */
	public static McObfPair field_186203_c = McMappingDatabase.getSRG("field_186203_c");

	/**
	 * <p>
	 * Name: addHelper
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Lnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;)Lnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;]
	 * </p>
	 */
	public static McObfPair func_189935_b = McMappingDatabase.getSRG("StructureEndCityPieces.func_189935_b");

	/**
	 * <p>
	 * Name: addPiece
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/template/TemplateManager;Lnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/lang/String;Lnet/minecraft/util/Rotation;Z)Lnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;]
	 * </p>
	 */
	public static McObfPair func_191090_b = McMappingDatabase.getSRG("StructureEndCityPieces.func_191090_b");

	/**
	 * <p>
	 * Name: OVERWRITE
	 * </p>
	 */
	public static McObfPair field_186202_b = McMappingDatabase.getSRG("field_186202_b");

	/**
	 * <p>
	 * Name: TOWER_GENERATOR
	 * </p>
	 */
	public static McObfPair field_186206_f = McMappingDatabase.getSRG("field_186206_f");

	/**
	 * <p>
	 * Name: HOUSE_TOWER_GENERATOR
	 * </p>
	 */
	public static McObfPair field_186204_d = McMappingDatabase.getSRG("field_186204_d");

	/**
	 * <p>
	 * Name: startHouseTower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/template/TemplateManager;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/Rotation;Ljava/util/List;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_191087_a = McMappingDatabase.getSRG("StructureEndCityPieces.func_191087_a");

	/**
	 * <p>
	 * Name: registerPieces
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186200_a = McMappingDatabase.getSRG("StructureEndCityPieces.func_186200_a");

	/**
	 * <p>
	 * Name: TOWER_BRIDGES
	 * </p>
	 */
	public static McObfPair field_186205_e = McMappingDatabase.getSRG("field_186205_e");

	/**
	 * <p>
	 * Name: recursiveChildren
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/template/TemplateManager;Lnet/minecraft/world/gen/structure/StructureEndCityPieces$IGenerator;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z]
	 * </p>
	 */
	public static McObfPair func_191088_b = McMappingDatabase.getSRG("StructureEndCityPieces.func_191088_b");

}
