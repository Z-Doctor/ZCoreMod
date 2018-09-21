package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityMinecartTNT {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afm";
		else
			return "net/minecraft/entity/item/EntityMinecartTNT";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afm";
		else
			return "EntityMinecartTNT";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafm;";
		else
			return "Lnet/minecraft/entity/item/EntityMinecartTNT;";
	}

	/**
	 * <p>
	 * Name: attackEntityFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;F)Z]
	 * </p>
	 */
	public static McObfPair func_70097_a = McMappingDatabase.getSRG("EntityMinecartTNT.func_70097_a");

	/**
	 * <p>
	 * Name: fall
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_180430_e = McMappingDatabase.getSRG("EntityMinecartTNT.func_180430_e");

	/**
	 * <p>
	 * Name: explodeCart
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_94103_c = McMappingDatabase.getSRG("EntityMinecartTNT.func_94103_c");

	/**
	 * <p>
	 * Name: getFuseTicks
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_94104_d = McMappingDatabase.getSRG("EntityMinecartTNT.func_94104_d");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityMinecartTNT.func_70071_h_");

	/**
	 * <p>
	 * Name: canExplosionDestroyBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/Explosion;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;F)Z]
	 * </p>
	 */
	public static McObfPair func_174816_a = McMappingDatabase.getSRG("EntityMinecartTNT.func_174816_a");

	/**
	 * <p>
	 * Name: minecartTNTFuse
	 * </p>
	 */
	public static McObfPair field_94106_a = McMappingDatabase.getSRG("field_94106_a");

	/**
	 * <p>
	 * Name: getDefaultDisplayTile
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180457_u = McMappingDatabase.getSRG("EntityMinecartTNT.func_180457_u");

	/**
	 * <p>
	 * Name: killMinecart
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_94095_a = McMappingDatabase.getSRG("EntityMinecartTNT.func_94095_a");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityMinecartTNT.func_70103_a");

	/**
	 * <p>
	 * Name: getExplosionResistance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/Explosion;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)F]
	 * </p>
	 */
	public static McObfPair func_180428_a = McMappingDatabase.getSRG("EntityMinecartTNT.func_180428_a");

	/**
	 * <p>
	 * Name: isIgnited
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_96096_ay = McMappingDatabase.getSRG("EntityMinecartTNT.func_96096_ay");

	/**
	 * <p>
	 * Name: ignite
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_94105_c = McMappingDatabase.getSRG("EntityMinecartTNT.func_94105_c");

	/**
	 * <p>
	 * Name: onActivatorRailPass
	 * </p>
	 * <p>
	 * Desc: [(IIIZ)V]
	 * </p>
	 */
	public static McObfPair func_96095_a = McMappingDatabase.getSRG("EntityMinecartTNT.func_96095_a");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/item/EntityMinecart$Type;]
	 * </p>
	 */
	public static McObfPair func_184264_v = McMappingDatabase.getSRG("EntityMinecartTNT.func_184264_v");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityMinecartTNT.func_70014_b");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityMinecartTNT.func_70037_a");

	/**
	 * <p>
	 * Name: registerFixesMinecartTNT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189674_a = McMappingDatabase.getSRG("EntityMinecartTNT.func_189674_a");

}
