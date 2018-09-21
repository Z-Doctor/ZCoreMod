package zdoctor.zcoremod.map.minecraft.network.play.server;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SPacketRecipeBook {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "js";
		else
			return "net/minecraft/network/play/server/SPacketRecipeBook";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "js";
		else
			return "SPacketRecipeBook";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ljs;";
		else
			return "Lnet/minecraft/network/play/server/SPacketRecipeBook;";
	}

	/**
	 * <p>
	 * Name: recipes
	 * </p>
	 */
	public static McObfPair field_192596_a = McMappingDatabase.getSRG("field_192596_a");

	/**
	 * <p>
	 * Name: isFilteringCraftable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192594_d = McMappingDatabase.getSRG("SPacketRecipeBook.func_192594_d");

	/**
	 * <p>
	 * Name: filteringCraftable
	 * </p>
	 */
	public static McObfPair field_192599_d = McMappingDatabase.getSRG("field_192599_d");

	/**
	 * <p>
	 * Name: getRecipes
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_192595_a = McMappingDatabase.getSRG("SPacketRecipeBook.func_192595_a");

	/**
	 * <p>
	 * Name: writePacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148840_b = McMappingDatabase.getSRG("SPacketRecipeBook.func_148840_b");

	/**
	 * <p>
	 * Name: readPacketData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_148837_a = McMappingDatabase.getSRG("SPacketRecipeBook.func_148837_a");

	/**
	 * <p>
	 * Name: guiOpen
	 * </p>
	 */
	public static McObfPair field_192598_c = McMappingDatabase.getSRG("field_192598_c");

	/**
	 * <p>
	 * Name: processPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/INetHandler;)V, (Lnet/minecraft/network/play/INetHandlerPlayClient;)V]
	 * </p>
	 */
	public static McObfPair func_148833_a = McMappingDatabase.getSRG("SPacketRecipeBook.func_148833_a");

	/**
	 * <p>
	 * Name: getDisplayedRecipes
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_193644_b = McMappingDatabase.getSRG("SPacketRecipeBook.func_193644_b");

	/**
	 * <p>
	 * Name: displayedRecipes
	 * </p>
	 */
	public static McObfPair field_193647_c = McMappingDatabase.getSRG("field_193647_c");

	/**
	 * <p>
	 * Name: isGuiOpen
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192593_c = McMappingDatabase.getSRG("SPacketRecipeBook.func_192593_c");

	/**
	 * <p>
	 * Name: state
	 * </p>
	 */
	public static McObfPair field_193646_a = McMappingDatabase.getSRG("field_193646_a");

	/**
	 * <p>
	 * Name: getState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/server/SPacketRecipeBook$State;]
	 * </p>
	 */
	public static McObfPair func_194151_e = McMappingDatabase.getSRG("SPacketRecipeBook.func_194151_e");

}
