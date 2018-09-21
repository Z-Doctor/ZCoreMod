package zdoctor.zcoremod.map.minecraft.world.gen.structure.template;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Template {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcj";
		else
			return "net/minecraft/world/gen/structure/template/Template";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcj";
		else
			return "Template";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcj;";
		else
			return "Lnet/minecraft/world/gen/structure/template/Template;";
	}

	/**
	 * <p>
	 * Name: registerFixes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_191158_a = McMappingDatabase.getSRG("Template.func_191158_a");

	/**
	 * <p>
	 * Name: addBlocksToWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/gen/structure/template/PlacementSettings;)V]
	 * </p>
	 */
	public static McObfPair func_186253_b = McMappingDatabase.getSRG("Template.func_186253_b");

	/**
	 * <p>
	 * Name: getAuthor
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_186261_b = McMappingDatabase.getSRG("Template.func_186261_b");

	/**
	 * <p>
	 * Name: takeBlocksFromWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;ZLnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_186254_a = McMappingDatabase.getSRG("Template.func_186254_a");

	/**
	 * <p>
	 * Name: transformedBlockPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/template/PlacementSettings;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_186266_a = McMappingDatabase.getSRG("Template.func_186266_a");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189552_a = McMappingDatabase.getSRG("Template.func_189552_a");

	/**
	 * <p>
	 * Name: transformedVec3d
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/Mirror;Lnet/minecraft/util/Rotation;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_186269_a = McMappingDatabase.getSRG("Template.func_186269_a");

	/**
	 * <p>
	 * Name: setAuthor
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_186252_a = McMappingDatabase.getSRG("Template.func_186252_a");

	/**
	 * <p>
	 * Name: transformedBlockPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/Mirror;Lnet/minecraft/util/Rotation;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_186268_a = McMappingDatabase.getSRG("Template.func_186268_a");

	/**
	 * <p>
	 * Name: addBlocksToWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/gen/structure/template/PlacementSettings;I)V]
	 * </p>
	 */
	public static McObfPair func_189962_a = McMappingDatabase.getSRG("Template.func_189962_a");

	/**
	 * <p>
	 * Name: getZeroPositionWithTransform
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/Mirror;Lnet/minecraft/util/Rotation;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_189961_a = McMappingDatabase.getSRG("Template.func_189961_a");

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_186259_a = McMappingDatabase.getSRG("Template.func_186259_a");

	/**
	 * <p>
	 * Name: blocks
	 * </p>
	 */
	public static McObfPair field_186270_a = McMappingDatabase.getSRG("field_186270_a");

	/**
	 * <p>
	 * Name: addBlocksToWorldChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/gen/structure/template/PlacementSettings;)V]
	 * </p>
	 */
	public static McObfPair func_186260_a = McMappingDatabase.getSRG("Template.func_186260_a");

	/**
	 * <p>
	 * Name: getZeroPositionWithTransform
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/Mirror;Lnet/minecraft/util/Rotation;II)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_191157_a = McMappingDatabase.getSRG("Template.func_191157_a");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_186256_b = McMappingDatabase.getSRG("Template.func_186256_b");

	/**
	 * <p>
	 * Name: addBlocksToWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/gen/structure/template/ITemplateProcessor;Lnet/minecraft/world/gen/structure/template/PlacementSettings;I)V]
	 * </p>
	 */
	public static McObfPair func_189960_a = McMappingDatabase.getSRG("Template.func_189960_a");

	/**
	 * <p>
	 * Name: transformedSize
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Rotation;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_186257_a = McMappingDatabase.getSRG("Template.func_186257_a");

	/**
	 * <p>
	 * Name: addEntitiesToWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/Mirror;Lnet/minecraft/util/Rotation;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_186263_a = McMappingDatabase.getSRG("Template.func_186263_a");

	/**
	 * <p>
	 * Name: entities
	 * </p>
	 */
	public static McObfPair field_186271_b = McMappingDatabase.getSRG("field_186271_b");

	/**
	 * <p>
	 * Name: size
	 * </p>
	 */
	public static McObfPair field_186272_c = McMappingDatabase.getSRG("field_186272_c");

	/**
	 * <p>
	 * Name: writeInts
	 * </p>
	 * <p>
	 * Desc: [([I)Lnet/minecraft/nbt/NBTTagList;]
	 * </p>
	 */
	public static McObfPair func_186267_a = McMappingDatabase.getSRG("Template.func_186267_a");

	/**
	 * <p>
	 * Name: author
	 * </p>
	 */
	public static McObfPair field_186273_d = McMappingDatabase.getSRG("field_186273_d");

	/**
	 * <p>
	 * Name: writeDoubles
	 * </p>
	 * <p>
	 * Desc: [([D)Lnet/minecraft/nbt/NBTTagList;]
	 * </p>
	 */
	public static McObfPair func_186264_a = McMappingDatabase.getSRG("Template.func_186264_a");

	/**
	 * <p>
	 * Name: calculateConnectedPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/template/PlacementSettings;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/gen/structure/template/PlacementSettings;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_186262_a = McMappingDatabase.getSRG("Template.func_186262_a");

	/**
	 * <p>
	 * Name: takeEntitiesFromWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_186255_a = McMappingDatabase.getSRG("Template.func_186255_a");

	/**
	 * <p>
	 * Name: getDataBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/gen/structure/template/PlacementSettings;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_186258_a = McMappingDatabase.getSRG("Template.func_186258_a");

}
