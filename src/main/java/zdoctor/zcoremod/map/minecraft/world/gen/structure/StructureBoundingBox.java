package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureBoundingBox {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbg";
		else
			return "net/minecraft/world/gen/structure/StructureBoundingBox";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbg";
		else
			return "StructureBoundingBox";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbg;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureBoundingBox;";
	}

	/**
	 * <p>
	 * Name: intersectsWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_78884_a = McMappingDatabase.getSRG("StructureBoundingBox.func_78884_a");

	/**
	 * <p>
	 * Name: createProper
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)Lnet/minecraft/world/gen/structure/StructureBoundingBox;]
	 * </p>
	 */
	public static McObfPair func_175899_a = McMappingDatabase.getSRG("StructureBoundingBox.func_175899_a");

	/**
	 * <p>
	 * Name: getZSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_78880_d = McMappingDatabase.getSRG("StructureBoundingBox.func_78880_d");

	/**
	 * <p>
	 * Name: minX
	 * </p>
	 */
	public static McObfPair field_78897_a = McMappingDatabase.getSRG("field_78897_a");

	/**
	 * <p>
	 * Name: maxZ
	 * </p>
	 */
	public static McObfPair field_78892_f = McMappingDatabase.getSRG("field_78892_f");

	/**
	 * <p>
	 * Name: getNewBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/gen/structure/StructureBoundingBox;]
	 * </p>
	 */
	public static McObfPair func_78887_a = McMappingDatabase.getSRG("StructureBoundingBox.func_78887_a");

	/**
	 * <p>
	 * Name: offset
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_78886_a = McMappingDatabase.getSRG("StructureBoundingBox.func_78886_a");

	/**
	 * <p>
	 * Name: minY
	 * </p>
	 */
	public static McObfPair field_78895_b = McMappingDatabase.getSRG("field_78895_b");

	/**
	 * <p>
	 * Name: intersectsWith
	 * </p>
	 * <p>
	 * Desc: [(IIII)Z]
	 * </p>
	 */
	public static McObfPair func_78885_a = McMappingDatabase.getSRG("StructureBoundingBox.func_78885_a");

	/**
	 * <p>
	 * Name: getLength
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3i;]
	 * </p>
	 */
	public static McObfPair func_175896_b = McMappingDatabase.getSRG("StructureBoundingBox.func_175896_b");

	/**
	 * <p>
	 * Name: maxX
	 * </p>
	 */
	public static McObfPair field_78893_d = McMappingDatabase.getSRG("field_78893_d");

	/**
	 * <p>
	 * Name: toNBTTagIntArray
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagIntArray;]
	 * </p>
	 */
	public static McObfPair func_151535_h = McMappingDatabase.getSRG("StructureBoundingBox.func_151535_h");

	/**
	 * <p>
	 * Name: maxY
	 * </p>
	 */
	public static McObfPair field_78894_e = McMappingDatabase.getSRG("field_78894_e");

	/**
	 * <p>
	 * Name: getComponentToAddBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIIIILnet/minecraft/util/EnumFacing;)Lnet/minecraft/world/gen/structure/StructureBoundingBox;]
	 * </p>
	 */
	public static McObfPair func_175897_a = McMappingDatabase.getSRG("StructureBoundingBox.func_175897_a");

	/**
	 * <p>
	 * Name: minZ
	 * </p>
	 */
	public static McObfPair field_78896_c = McMappingDatabase.getSRG("field_78896_c");

	/**
	 * <p>
	 * Name: getYSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_78882_c = McMappingDatabase.getSRG("StructureBoundingBox.func_78882_c");

	/**
	 * <p>
	 * Name: getXSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_78883_b = McMappingDatabase.getSRG("StructureBoundingBox.func_78883_b");

	/**
	 * <p>
	 * Name: expandTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_78888_b = McMappingDatabase.getSRG("StructureBoundingBox.func_78888_b");

	/**
	 * <p>
	 * Name: isVecInside
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3i;)Z]
	 * </p>
	 */
	public static McObfPair func_175898_b = McMappingDatabase.getSRG("StructureBoundingBox.func_175898_b");

}
