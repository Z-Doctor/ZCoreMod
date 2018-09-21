package zdoctor.zcoremod.map.minecraft.nbt;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class JsonToNBT {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gp";
		else
			return "net/minecraft/nbt/JsonToNBT";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gp";
		else
			return "JsonToNBT";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgp;";
		else
			return "Lnet/minecraft/nbt/JsonToNBT;";
	}

	/**
	 * <p>
	 * Name: skipWhitespace
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193607_l = McMappingDatabase.getSRG("JsonToNBT.func_193607_l");

	/**
	 * <p>
	 * Name: DOUBLE_PATTERN
	 * </p>
	 */
	public static McObfPair field_193616_b = McMappingDatabase.getSRG("field_193616_b");

	/**
	 * <p>
	 * Name: readStruct
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_193593_f = McMappingDatabase.getSRG("JsonToNBT.func_193593_f");

	/**
	 * <p>
	 * Name: readQuotedString
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_193595_h = McMappingDatabase.getSRG("JsonToNBT.func_193595_h");

	/**
	 * <p>
	 * Name: string
	 * </p>
	 */
	public static McObfPair field_193622_h = McMappingDatabase.getSRG("field_193622_h");

	/**
	 * <p>
	 * Name: readArray
	 * </p>
	 * <p>
	 * Desc: [(BB)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_193603_a = McMappingDatabase.getSRG("JsonToNBT.func_193603_a");

	/**
	 * <p>
	 * Name: FLOAT_PATTERN
	 * </p>
	 */
	public static McObfPair field_193617_c = McMappingDatabase.getSRG("field_193617_c");

	/**
	 * <p>
	 * Name: readSingleStruct
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_193609_a = McMappingDatabase.getSRG("JsonToNBT.func_193609_a");

	/**
	 * <p>
	 * Name: INT_PATTERN
	 * </p>
	 */
	public static McObfPair field_193621_g = McMappingDatabase.getSRG("field_193621_g");

	/**
	 * <p>
	 * Name: canRead
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193612_g = McMappingDatabase.getSRG("JsonToNBT.func_193612_g");

	/**
	 * <p>
	 * Name: peek
	 * </p>
	 * <p>
	 * Desc: [()C]
	 * </p>
	 */
	public static McObfPair func_193598_n = McMappingDatabase.getSRG("JsonToNBT.func_193598_n");

	/**
	 * <p>
	 * Name: readList
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTBase;]
	 * </p>
	 */
	public static McObfPair func_193605_e = McMappingDatabase.getSRG("JsonToNBT.func_193605_e");

	/**
	 * <p>
	 * Name: readListTag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTBase;]
	 * </p>
	 */
	public static McObfPair func_193600_j = McMappingDatabase.getSRG("JsonToNBT.func_193600_j");

	/**
	 * <p>
	 * Name: DOUBLE_PATTERN_NOSUFFIX
	 * </p>
	 */
	public static McObfPair field_193615_a = McMappingDatabase.getSRG("field_193615_a");

	/**
	 * <p>
	 * Name: readTypedValue
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTBase;]
	 * </p>
	 */
	public static McObfPair func_193611_c = McMappingDatabase.getSRG("JsonToNBT.func_193611_c");

	/**
	 * <p>
	 * Name: getTagFromJson
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_180713_a = McMappingDatabase.getSRG("JsonToNBT.func_180713_a");

	/**
	 * <p>
	 * Name: LONG_PATTERN
	 * </p>
	 */
	public static McObfPair field_193619_e = McMappingDatabase.getSRG("field_193619_e");

	/**
	 * <p>
	 * Name: cursor
	 * </p>
	 */
	public static McObfPair field_193623_i = McMappingDatabase.getSRG("field_193623_i");

	/**
	 * <p>
	 * Name: readArrayTag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTBase;]
	 * </p>
	 */
	public static McObfPair func_193606_k = McMappingDatabase.getSRG("JsonToNBT.func_193606_k");

	/**
	 * <p>
	 * Name: readValue
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTBase;]
	 * </p>
	 */
	public static McObfPair func_193610_d = McMappingDatabase.getSRG("JsonToNBT.func_193610_d");

	/**
	 * <p>
	 * Name: SHORT_PATTERN
	 * </p>
	 */
	public static McObfPair field_193620_f = McMappingDatabase.getSRG("field_193620_f");

	/**
	 * <p>
	 * Name: exception
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/nbt/NBTException;]
	 * </p>
	 */
	public static McObfPair func_193602_b = McMappingDatabase.getSRG("JsonToNBT.func_193602_b");

	/**
	 * <p>
	 * Name: readString
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_193614_i = McMappingDatabase.getSRG("JsonToNBT.func_193614_i");

	/**
	 * <p>
	 * Name: BYTE_PATTERN
	 * </p>
	 */
	public static McObfPair field_193618_d = McMappingDatabase.getSRG("field_193618_d");

	/**
	 * <p>
	 * Name: pop
	 * </p>
	 * <p>
	 * Desc: [()C]
	 * </p>
	 */
	public static McObfPair func_193594_o = McMappingDatabase.getSRG("JsonToNBT.func_193594_o");

	/**
	 * <p>
	 * Name: expect
	 * </p>
	 * <p>
	 * Desc: [(C)V]
	 * </p>
	 */
	public static McObfPair func_193604_b = McMappingDatabase.getSRG("JsonToNBT.func_193604_b");

	/**
	 * <p>
	 * Name: isAllowedInKey
	 * </p>
	 * <p>
	 * Desc: [(C)Z]
	 * </p>
	 */
	public static McObfPair func_193599_a = McMappingDatabase.getSRG("JsonToNBT.func_193599_a");

	/**
	 * <p>
	 * Name: hasElementSeparator
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193613_m = McMappingDatabase.getSRG("JsonToNBT.func_193613_m");

	/**
	 * <p>
	 * Name: canRead
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_193608_a = McMappingDatabase.getSRG("JsonToNBT.func_193608_a");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/nbt/NBTBase;]
	 * </p>
	 */
	public static McObfPair func_193596_c = McMappingDatabase.getSRG("JsonToNBT.func_193596_c");

	/**
	 * <p>
	 * Name: peek
	 * </p>
	 * <p>
	 * Desc: [(I)C]
	 * </p>
	 */
	public static McObfPair func_193597_b = McMappingDatabase.getSRG("JsonToNBT.func_193597_b");

	/**
	 * <p>
	 * Name: readKey
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_193601_b = McMappingDatabase.getSRG("JsonToNBT.func_193601_b");

}
