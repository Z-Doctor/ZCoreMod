package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureComponent {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbx";
		else
			return "net/minecraft/world/gen/structure/StructureComponent";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbx";
		else
			return "StructureComponent";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbx;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureComponent;";
	}

	/**
	 * <p>
	 * Name: getYWithOffset
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_74862_a = McMappingDatabase.getSRG("StructureComponent.func_74862_a");

	/**
	 * <p>
	 * Name: generateChest
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;IIILnet/minecraft/util/ResourceLocation;)Z]
	 * </p>
	 */
	public static McObfPair func_186167_a = McMappingDatabase.getSRG("StructureComponent.func_186167_a");

	/**
	 * <p>
	 * Name: createDispenser
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;Lnet/minecraft/util/ResourceLocation;)Z]
	 * </p>
	 */
	public static McObfPair func_189419_a = McMappingDatabase.getSRG("StructureComponent.func_189419_a");

	/**
	 * <p>
	 * Name: setBlockState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/block/state/IBlockState;IIILnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_175811_a = McMappingDatabase.getSRG("StructureComponent.func_175811_a");

	/**
	 * <p>
	 * Name: fillWithRandomizedBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;IIIIIIZLjava/util/Random;Lnet/minecraft/world/gen/structure/StructureComponent$BlockSelector;)V]
	 * </p>
	 */
	public static McObfPair func_74882_a = McMappingDatabase.getSRG("StructureComponent.func_74882_a");

	/**
	 * <p>
	 * Name: getZWithOffset
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_74873_b = McMappingDatabase.getSRG("StructureComponent.func_74873_b");

	/**
	 * <p>
	 * Name: getSkyBrightness
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;IIILnet/minecraft/world/gen/structure/StructureBoundingBox;)I]
	 * </p>
	 */
	public static McObfPair func_189916_b = McMappingDatabase.getSRG("StructureComponent.func_189916_b");

	/**
	 * <p>
	 * Name: mirror
	 * </p>
	 */
	public static McObfPair field_186168_b = McMappingDatabase.getSRG("field_186168_b");

	/**
	 * <p>
	 * Name: coordBaseMode
	 * </p>
	 */
	public static McObfPair field_74885_f = McMappingDatabase.getSRG("field_74885_f");

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("StructureComponent.func_74875_a");

	/**
	 * <p>
	 * Name: getCoordBaseMode
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_186165_e = McMappingDatabase.getSRG("StructureComponent.func_186165_e");

	/**
	 * <p>
	 * Name: findIntersecting
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Lnet/minecraft/world/gen/structure/StructureComponent;]
	 * </p>
	 */
	public static McObfPair func_74883_a = McMappingDatabase.getSRG("StructureComponent.func_74883_a");

	/**
	 * <p>
	 * Name: boundingBox
	 * </p>
	 */
	public static McObfPair field_74887_e = McMappingDatabase.getSRG("field_74887_e");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("StructureComponent.func_143011_b");

	/**
	 * <p>
	 * Name: offset
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_181138_a = McMappingDatabase.getSRG("StructureComponent.func_181138_a");

	/**
	 * <p>
	 * Name: clearCurrentPositionBlocksUpwards
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;IIILnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_74871_b = McMappingDatabase.getSRG("StructureComponent.func_74871_b");

	/**
	 * <p>
	 * Name: getComponentType
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_74877_c = McMappingDatabase.getSRG("StructureComponent.func_74877_c");

	/**
	 * <p>
	 * Name: componentType
	 * </p>
	 */
	public static McObfPair field_74886_g = McMappingDatabase.getSRG("field_74886_g");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/gen/structure/StructureBoundingBox;]
	 * </p>
	 */
	public static McObfPair func_74874_b = McMappingDatabase.getSRG("StructureComponent.func_74874_b");

	/**
	 * <p>
	 * Name: randomlyRareFillWithBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;IIIIIILnet/minecraft/block/state/IBlockState;Z)V]
	 * </p>
	 */
	public static McObfPair func_180777_a = McMappingDatabase.getSRG("StructureComponent.func_180777_a");

	/**
	 * <p>
	 * Name: fillWithBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;IIIIIILnet/minecraft/block/state/IBlockState;Lnet/minecraft/block/state/IBlockState;Z)V]
	 * </p>
	 */
	public static McObfPair func_175804_a = McMappingDatabase.getSRG("StructureComponent.func_175804_a");

	/**
	 * <p>
	 * Name: setCoordBaseMode
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_186164_a = McMappingDatabase.getSRG("StructureComponent.func_186164_a");

	/**
	 * <p>
	 * Name: rotation
	 * </p>
	 */
	public static McObfPair field_186169_c = McMappingDatabase.getSRG("field_186169_c");

	/**
	 * <p>
	 * Name: generateMaybeBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;FIIIIIILnet/minecraft/block/state/IBlockState;Lnet/minecraft/block/state/IBlockState;ZI)V]
	 * </p>
	 */
	public static McObfPair func_189914_a = McMappingDatabase.getSRG("StructureComponent.func_189914_a");

	/**
	 * <p>
	 * Name: buildComponent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_74861_a = McMappingDatabase.getSRG("StructureComponent.func_74861_a");

	/**
	 * <p>
	 * Name: getXWithOffset
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_74865_a = McMappingDatabase.getSRG("StructureComponent.func_74865_a");

	/**
	 * <p>
	 * Name: createStructureBaseNBT
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_143010_b = McMappingDatabase.getSRG("StructureComponent.func_143010_b");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("StructureComponent.func_143012_a");

	/**
	 * <p>
	 * Name: getBlockStateFromPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;IIILnet/minecraft/world/gen/structure/StructureBoundingBox;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_175807_a = McMappingDatabase.getSRG("StructureComponent.func_175807_a");

	/**
	 * <p>
	 * Name: readStructureBaseNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143009_a = McMappingDatabase.getSRG("StructureComponent.func_143009_a");

	/**
	 * <p>
	 * Name: fillWithAir
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_74878_a = McMappingDatabase.getSRG("StructureComponent.func_74878_a");

	/**
	 * <p>
	 * Name: randomlyPlaceBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;FIIILnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_175809_a = McMappingDatabase.getSRG("StructureComponent.func_175809_a");

	/**
	 * <p>
	 * Name: generateDoor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;Lnet/minecraft/block/BlockDoor;)V]
	 * </p>
	 */
	public static McObfPair func_189915_a = McMappingDatabase.getSRG("StructureComponent.func_189915_a");

	/**
	 * <p>
	 * Name: generateChest
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/ResourceLocation;Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_191080_a = McMappingDatabase.getSRG("StructureComponent.func_191080_a");

	/**
	 * <p>
	 * Name: replaceAirAndLiquidDownwards
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/block/state/IBlockState;IIILnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_175808_b = McMappingDatabase.getSRG("StructureComponent.func_175808_b");

	/**
	 * <p>
	 * Name: isLiquidInStructureBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74860_a = McMappingDatabase.getSRG("StructureComponent.func_74860_a");

}
