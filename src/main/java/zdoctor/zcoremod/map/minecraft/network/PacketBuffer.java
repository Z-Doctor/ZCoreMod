package zdoctor.zcoremod.map.minecraft.network;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PacketBuffer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gy";
		else
			return "net/minecraft/network/PacketBuffer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gy";
		else
			return "PacketBuffer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgy;";
		else
			return "Lnet/minecraft/network/PacketBuffer;";
	}

	/**
	 * <p>
	 * Name: writeByteArray
	 * </p>
	 * <p>
	 * Desc: [([B)Lnet/minecraft/network/PacketBuffer;]
	 * </p>
	 */
	public static McObfPair func_179250_a = McMappingDatabase.getSRG("PacketBuffer.func_179250_a");

	/**
	 * <p>
	 * Name: readTextComponent
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_179258_d = McMappingDatabase.getSRG("PacketBuffer.func_179258_d");

	/**
	 * <p>
	 * Name: writeTime
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Date;)Lnet/minecraft/network/PacketBuffer;]
	 * </p>
	 */
	public static McObfPair func_192574_a = McMappingDatabase.getSRG("PacketBuffer.func_192574_a");

	/**
	 * <p>
	 * Name: writeBlockPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/network/PacketBuffer;]
	 * </p>
	 */
	public static McObfPair func_179255_a = McMappingDatabase.getSRG("PacketBuffer.func_179255_a");

	/**
	 * <p>
	 * Name: readByteArray
	 * </p>
	 * <p>
	 * Desc: [()[B]
	 * </p>
	 */
	public static McObfPair func_179251_a = McMappingDatabase.getSRG("PacketBuffer.func_179251_a");

	/**
	 * <p>
	 * Name: writeCompoundTag
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/network/PacketBuffer;]
	 * </p>
	 */
	public static McObfPair func_150786_a = McMappingDatabase.getSRG("PacketBuffer.func_150786_a");

	/**
	 * <p>
	 * Name: readVarInt
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_150792_a = McMappingDatabase.getSRG("PacketBuffer.func_150792_a");

	/**
	 * <p>
	 * Name: readVarIntArray
	 * </p>
	 * <p>
	 * Desc: [(I)[I]
	 * </p>
	 */
	public static McObfPair func_189424_c = McMappingDatabase.getSRG("PacketBuffer.func_189424_c");

	/**
	 * <p>
	 * Name: writeLongArray
	 * </p>
	 * <p>
	 * Desc: [([J)Lnet/minecraft/network/PacketBuffer;]
	 * </p>
	 */
	public static McObfPair func_186865_a = McMappingDatabase.getSRG("PacketBuffer.func_186865_a");

	/**
	 * <p>
	 * Name: getVarIntSize
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_150790_a = McMappingDatabase.getSRG("PacketBuffer.func_150790_a");

	/**
	 * <p>
	 * Name: writeString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/network/PacketBuffer;]
	 * </p>
	 */
	public static McObfPair func_180714_a = McMappingDatabase.getSRG("PacketBuffer.func_180714_a");

	/**
	 * <p>
	 * Name: readUniqueId
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/UUID;]
	 * </p>
	 */
	public static McObfPair func_179253_g = McMappingDatabase.getSRG("PacketBuffer.func_179253_g");

	/**
	 * <p>
	 * Name: writeVarIntArray
	 * </p>
	 * <p>
	 * Desc: [([I)Lnet/minecraft/network/PacketBuffer;]
	 * </p>
	 */
	public static McObfPair func_186875_a = McMappingDatabase.getSRG("PacketBuffer.func_186875_a");

	/**
	 * <p>
	 * Name: buf
	 * </p>
	 */
	public static McObfPair field_150794_a = McMappingDatabase.getSRG("field_150794_a");

	/**
	 * <p>
	 * Name: readEnumValue
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;)Ljava/lang/Enum;]
	 * </p>
	 */
	public static McObfPair func_179257_a = McMappingDatabase.getSRG("PacketBuffer.func_179257_a");

	/**
	 * <p>
	 * Name: writeVarLong
	 * </p>
	 * <p>
	 * Desc: [(J)Lnet/minecraft/network/PacketBuffer;]
	 * </p>
	 */
	public static McObfPair func_179254_b = McMappingDatabase.getSRG("PacketBuffer.func_179254_b");

	/**
	 * <p>
	 * Name: readByteArray
	 * </p>
	 * <p>
	 * Desc: [(I)[B]
	 * </p>
	 */
	public static McObfPair func_189425_b = McMappingDatabase.getSRG("PacketBuffer.func_189425_b");

	/**
	 * <p>
	 * Name: readCompoundTag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_150793_b = McMappingDatabase.getSRG("PacketBuffer.func_150793_b");

	/**
	 * <p>
	 * Name: readLongArray
	 * </p>
	 * <p>
	 * Desc: [([J)[J]
	 * </p>
	 */
	public static McObfPair func_186873_b = McMappingDatabase.getSRG("PacketBuffer.func_186873_b");

	/**
	 * <p>
	 * Name: readTime
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Date;]
	 * </p>
	 */
	public static McObfPair func_192573_m = McMappingDatabase.getSRG("PacketBuffer.func_192573_m");

	/**
	 * <p>
	 * Name: readLongArray
	 * </p>
	 * <p>
	 * Desc: [([JI)[J]
	 * </p>
	 */
	public static McObfPair func_189423_a = McMappingDatabase.getSRG("PacketBuffer.func_189423_a");

	/**
	 * <p>
	 * Name: writeResourceLocation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/network/PacketBuffer;]
	 * </p>
	 */
	public static McObfPair func_192572_a = McMappingDatabase.getSRG("PacketBuffer.func_192572_a");

	/**
	 * <p>
	 * Name: readItemStack
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_150791_c = McMappingDatabase.getSRG("PacketBuffer.func_150791_c");

	/**
	 * <p>
	 * Name: writeEnumValue
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Enum;)Lnet/minecraft/network/PacketBuffer;]
	 * </p>
	 */
	public static McObfPair func_179249_a = McMappingDatabase.getSRG("PacketBuffer.func_179249_a");

	/**
	 * <p>
	 * Name: writeTextComponent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)Lnet/minecraft/network/PacketBuffer;]
	 * </p>
	 */
	public static McObfPair func_179256_a = McMappingDatabase.getSRG("PacketBuffer.func_179256_a");

	/**
	 * <p>
	 * Name: writeItemStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/network/PacketBuffer;]
	 * </p>
	 */
	public static McObfPair func_150788_a = McMappingDatabase.getSRG("PacketBuffer.func_150788_a");

	/**
	 * <p>
	 * Name: writeVarInt
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/network/PacketBuffer;]
	 * </p>
	 */
	public static McObfPair func_150787_b = McMappingDatabase.getSRG("PacketBuffer.func_150787_b");

	/**
	 * <p>
	 * Name: writeUniqueId
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;)Lnet/minecraft/network/PacketBuffer;]
	 * </p>
	 */
	public static McObfPair func_179252_a = McMappingDatabase.getSRG("PacketBuffer.func_179252_a");

	/**
	 * <p>
	 * Name: readString
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150789_c = McMappingDatabase.getSRG("PacketBuffer.func_150789_c");

	/**
	 * <p>
	 * Name: readVarIntArray
	 * </p>
	 * <p>
	 * Desc: [()[I]
	 * </p>
	 */
	public static McObfPair func_186863_b = McMappingDatabase.getSRG("PacketBuffer.func_186863_b");

	/**
	 * <p>
	 * Name: readResourceLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_192575_l = McMappingDatabase.getSRG("PacketBuffer.func_192575_l");

	/**
	 * <p>
	 * Name: readBlockPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_179259_c = McMappingDatabase.getSRG("PacketBuffer.func_179259_c");

	/**
	 * <p>
	 * Name: readVarLong
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_179260_f = McMappingDatabase.getSRG("PacketBuffer.func_179260_f");

}
