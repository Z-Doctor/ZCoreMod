package zdoctor.zcoremod.map.minecraft.world.gen.structure.template;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlacementSettings {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bch";
		else
			return "net/minecraft/world/gen/structure/template/PlacementSettings";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bch";
		else
			return "PlacementSettings";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbch;";
		else
			return "Lnet/minecraft/world/gen/structure/template/PlacementSettings;";
	}

	/**
	 * <p>
	 * Name: setIgnoreStructureBlock
	 * </p>
	 * <p>
	 * Desc: [(Z)Lnet/minecraft/world/gen/structure/template/PlacementSettings;]
	 * </p>
	 */
	public static McObfPair func_186226_b = McMappingDatabase.getSRG("PlacementSettings.func_186226_b");

	/**
	 * <p>
	 * Name: chunk
	 * </p>
	 */
	public static McObfPair field_186232_e = McMappingDatabase.getSRG("field_186232_e");

	/**
	 * <p>
	 * Name: setSeed
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Long;)Lnet/minecraft/world/gen/structure/template/PlacementSettings;]
	 * </p>
	 */
	public static McObfPair func_189949_a = McMappingDatabase.getSRG("PlacementSettings.func_189949_a");

	/**
	 * <p>
	 * Name: getReplacedBlock
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_186219_f = McMappingDatabase.getSRG("PlacementSettings.func_186219_f");

	/**
	 * <p>
	 * Name: rotation
	 * </p>
	 */
	public static McObfPair field_186229_b = McMappingDatabase.getSRG("field_186229_b");

	/**
	 * <p>
	 * Name: setIgnoreEntities
	 * </p>
	 * <p>
	 * Desc: [(Z)Lnet/minecraft/world/gen/structure/template/PlacementSettings;]
	 * </p>
	 */
	public static McObfPair func_186222_a = McMappingDatabase.getSRG("PlacementSettings.func_186222_a");

	/**
	 * <p>
	 * Name: setSeed
	 * </p>
	 */
	public static McObfPair field_189953_j = McMappingDatabase.getSRG("field_189953_j");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/gen/structure/StructureBoundingBox;]
	 * </p>
	 */
	public static McObfPair func_186213_g = McMappingDatabase.getSRG("PlacementSettings.func_186213_g");

	/**
	 * <p>
	 * Name: setMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Mirror;)Lnet/minecraft/world/gen/structure/template/PlacementSettings;]
	 * </p>
	 */
	public static McObfPair func_186214_a = McMappingDatabase.getSRG("PlacementSettings.func_186214_a");

	/**
	 * <p>
	 * Name: setIntegrity
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/world/gen/structure/template/PlacementSettings;]
	 * </p>
	 */
	public static McObfPair func_189946_a = McMappingDatabase.getSRG("PlacementSettings.func_189946_a");

	/**
	 * <p>
	 * Name: setBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Lnet/minecraft/world/gen/structure/template/PlacementSettings;]
	 * </p>
	 */
	public static McObfPair func_186223_a = McMappingDatabase.getSRG("PlacementSettings.func_186223_a");

	/**
	 * <p>
	 * Name: ignoreEntities
	 * </p>
	 */
	public static McObfPair field_186230_c = McMappingDatabase.getSRG("field_186230_c");

	/**
	 * <p>
	 * Name: getBoundingBoxFromChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/ChunkPos;)Lnet/minecraft/world/gen/structure/StructureBoundingBox;]
	 * </p>
	 */
	public static McObfPair func_186216_b = McMappingDatabase.getSRG("PlacementSettings.func_186216_b");

	/**
	 * <p>
	 * Name: copy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/gen/structure/template/PlacementSettings;]
	 * </p>
	 */
	public static McObfPair func_186217_a = McMappingDatabase.getSRG("PlacementSettings.func_186217_a");

	/**
	 * <p>
	 * Name: getRotation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/Rotation;]
	 * </p>
	 */
	public static McObfPair func_186215_c = McMappingDatabase.getSRG("PlacementSettings.func_186215_c");

	/**
	 * <p>
	 * Name: getRandom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Ljava/util/Random;]
	 * </p>
	 */
	public static McObfPair func_189947_a = McMappingDatabase.getSRG("PlacementSettings.func_189947_a");

	/**
	 * <p>
	 * Name: setRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Rotation;)Lnet/minecraft/world/gen/structure/template/PlacementSettings;]
	 * </p>
	 */
	public static McObfPair func_186220_a = McMappingDatabase.getSRG("PlacementSettings.func_186220_a");

	/**
	 * <p>
	 * Name: getIgnoreEntities
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186221_e = McMappingDatabase.getSRG("PlacementSettings.func_186221_e");

	/**
	 * <p>
	 * Name: setChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/ChunkPos;)Lnet/minecraft/world/gen/structure/template/PlacementSettings;]
	 * </p>
	 */
	public static McObfPair func_186218_a = McMappingDatabase.getSRG("PlacementSettings.func_186218_a");

	/**
	 * <p>
	 * Name: setRandom
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/world/gen/structure/template/PlacementSettings;]
	 * </p>
	 */
	public static McObfPair func_189950_a = McMappingDatabase.getSRG("PlacementSettings.func_189950_a");

	/**
	 * <p>
	 * Name: getIgnoreStructureBlock
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186227_h = McMappingDatabase.getSRG("PlacementSettings.func_186227_h");

	/**
	 * <p>
	 * Name: random
	 * </p>
	 */
	public static McObfPair field_189952_i = McMappingDatabase.getSRG("field_189952_i");

	/**
	 * <p>
	 * Name: setReplacedBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Lnet/minecraft/world/gen/structure/template/PlacementSettings;]
	 * </p>
	 */
	public static McObfPair func_186225_a = McMappingDatabase.getSRG("PlacementSettings.func_186225_a");

	/**
	 * <p>
	 * Name: boundingBox
	 * </p>
	 */
	public static McObfPair field_186233_f = McMappingDatabase.getSRG("field_186233_f");

	/**
	 * <p>
	 * Name: ignoreStructureBlock
	 * </p>
	 */
	public static McObfPair field_186234_g = McMappingDatabase.getSRG("field_186234_g");

	/**
	 * <p>
	 * Name: setBoundingBoxFromChunk
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186224_i = McMappingDatabase.getSRG("PlacementSettings.func_186224_i");

	/**
	 * <p>
	 * Name: mirror
	 * </p>
	 */
	public static McObfPair field_186228_a = McMappingDatabase.getSRG("field_186228_a");

	/**
	 * <p>
	 * Name: getIntegrity
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_189948_f = McMappingDatabase.getSRG("PlacementSettings.func_189948_f");

	/**
	 * <p>
	 * Name: integrity
	 * </p>
	 */
	public static McObfPair field_189951_h = McMappingDatabase.getSRG("field_189951_h");

	/**
	 * <p>
	 * Name: replacedBlock
	 * </p>
	 */
	public static McObfPair field_186231_d = McMappingDatabase.getSRG("field_186231_d");

	/**
	 * <p>
	 * Name: getMirror
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/Mirror;]
	 * </p>
	 */
	public static McObfPair func_186212_b = McMappingDatabase.getSRG("PlacementSettings.func_186212_b");

}
