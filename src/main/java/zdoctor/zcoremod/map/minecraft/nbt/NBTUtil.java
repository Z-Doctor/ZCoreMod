package zdoctor.zcoremod.map.minecraft.nbt;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NBTUtil {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gj";
		else
			return "net/minecraft/nbt/NBTUtil";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gj";
		else
			return "NBTUtil";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgj;";
		else
			return "Lnet/minecraft/nbt/NBTUtil;";
	}

	/**
	 * <p>
	 * Name: setValueHelper
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/block/properties/IProperty;Ljava/lang/String;Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_193590_a = McMappingDatabase.getSRG("NBTUtil.func_193590_a");

	/**
	 * <p>
	 * Name: writeGameProfile
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lcom/mojang/authlib/GameProfile;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_180708_a = McMappingDatabase.getSRG("NBTUtil.func_180708_a");

	/**
	 * <p>
	 * Name: readBlockState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_190008_d = McMappingDatabase.getSRG("NBTUtil.func_190008_d");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/properties/IProperty;Ljava/lang/Comparable;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_190010_a = McMappingDatabase.getSRG("NBTUtil.func_190010_a");

	/**
	 * <p>
	 * Name: readGameProfileFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_152459_a = McMappingDatabase.getSRG("NBTUtil.func_152459_a");

	/**
	 * <p>
	 * Name: createUUIDTag
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_186862_a = McMappingDatabase.getSRG("NBTUtil.func_186862_a");

	/**
	 * <p>
	 * Name: writeBlockState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_190009_a = McMappingDatabase.getSRG("NBTUtil.func_190009_a");

	/**
	 * <p>
	 * Name: getUUIDFromTag
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Ljava/util/UUID;]
	 * </p>
	 */
	public static McObfPair func_186860_b = McMappingDatabase.getSRG("NBTUtil.func_186860_b");

	/**
	 * <p>
	 * Name: getPosFromTag
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_186861_c = McMappingDatabase.getSRG("NBTUtil.func_186861_c");

	/**
	 * <p>
	 * Name: areNBTEquals
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTBase;Lnet/minecraft/nbt/NBTBase;Z)Z]
	 * </p>
	 */
	public static McObfPair func_181123_a = McMappingDatabase.getSRG("NBTUtil.func_181123_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_193591_a = McMappingDatabase.getSRG("field_193591_a");

	/**
	 * <p>
	 * Name: createPosTag
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_186859_a = McMappingDatabase.getSRG("NBTUtil.func_186859_a");

}
