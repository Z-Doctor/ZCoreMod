package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DisplayInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "r";
		else
			return "net/minecraft/advancements/DisplayInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "r";
		else
			return "DisplayInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lr;";
		else
			return "Lnet/minecraft/advancements/DisplayInfo;";
	}

	/**
	 * <p>
	 * Name: isHidden
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193224_j = McMappingDatabase.getSRG("DisplayInfo.func_193224_j");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_192296_f = McMappingDatabase.getSRG("DisplayInfo.func_192296_f");

	/**
	 * <p>
	 * Name: getBackground
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_192293_c = McMappingDatabase.getSRG("DisplayInfo.func_192293_c");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_192305_f = McMappingDatabase.getSRG("field_192305_f");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_192299_e = McMappingDatabase.getSRG("DisplayInfo.func_192299_e");

	/**
	 * <p>
	 * Name: description
	 * </p>
	 */
	public static McObfPair field_193225_b = McMappingDatabase.getSRG("field_193225_b");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_192304_e = McMappingDatabase.getSRG("field_192304_e");

	/**
	 * <p>
	 * Name: shouldAnnounceToChat
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193220_i = McMappingDatabase.getSRG("DisplayInfo.func_193220_i");

	/**
	 * <p>
	 * Name: getIcon
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_192298_b = McMappingDatabase.getSRG("DisplayInfo.func_192298_b");

	/**
	 * <p>
	 * Name: icon
	 * </p>
	 */
	public static McObfPair field_192301_b = McMappingDatabase.getSRG("field_192301_b");

	/**
	 * <p>
	 * Name: announceToChat
	 * </p>
	 */
	public static McObfPair field_193227_g = McMappingDatabase.getSRG("field_193227_g");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonDeserializationContext;)Lnet/minecraft/advancements/DisplayInfo;]
	 * </p>
	 */
	public static McObfPair func_192294_a = McMappingDatabase.getSRG("DisplayInfo.func_192294_a");

	/**
	 * <p>
	 * Name: deserializeIcon
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/gson/JsonObject;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_193221_a = McMappingDatabase.getSRG("DisplayInfo.func_193221_a");

	/**
	 * <p>
	 * Name: hidden
	 * </p>
	 */
	public static McObfPair field_193228_h = McMappingDatabase.getSRG("field_193228_h");

	/**
	 * <p>
	 * Name: getFrame
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/advancements/FrameType;]
	 * </p>
	 */
	public static McObfPair func_192291_d = McMappingDatabase.getSRG("DisplayInfo.func_192291_d");

	/**
	 * <p>
	 * Name: shouldShowToast
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193223_h = McMappingDatabase.getSRG("DisplayInfo.func_193223_h");

	/**
	 * <p>
	 * Name: background
	 * </p>
	 */
	public static McObfPair field_192302_c = McMappingDatabase.getSRG("field_192302_c");

	/**
	 * <p>
	 * Name: getDescription
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_193222_b = McMappingDatabase.getSRG("DisplayInfo.func_193222_b");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_192290_a = McMappingDatabase.getSRG("DisplayInfo.func_192290_a");

	/**
	 * <p>
	 * Name: frame
	 * </p>
	 */
	public static McObfPair field_192303_d = McMappingDatabase.getSRG("field_192303_d");

	/**
	 * <p>
	 * Name: title
	 * </p>
	 */
	public static McObfPair field_192300_a = McMappingDatabase.getSRG("field_192300_a");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)Lnet/minecraft/advancements/DisplayInfo;]
	 * </p>
	 */
	public static McObfPair func_192295_b = McMappingDatabase.getSRG("DisplayInfo.func_192295_b");

	/**
	 * <p>
	 * Name: showToast
	 * </p>
	 */
	public static McObfPair field_193226_f = McMappingDatabase.getSRG("field_193226_f");

	/**
	 * <p>
	 * Name: setPosition
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_192292_a = McMappingDatabase.getSRG("DisplayInfo.func_192292_a");

	/**
	 * <p>
	 * Name: getTitle
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_192297_a = McMappingDatabase.getSRG("DisplayInfo.func_192297_a");

}
