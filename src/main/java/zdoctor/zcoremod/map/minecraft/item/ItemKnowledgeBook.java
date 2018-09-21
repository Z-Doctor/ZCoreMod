package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemKnowledgeBook {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ais";
		else
			return "net/minecraft/item/ItemKnowledgeBook";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ais";
		else
			return "ItemKnowledgeBook";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lais;";
		else
			return "Lnet/minecraft/item/ItemKnowledgeBook;";
	}

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_194126_a = McMappingDatabase.getSRG("field_194126_a");

	/**
	 * <p>
	 * Name: onItemRightClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;]
	 * </p>
	 */
	public static McObfPair func_77659_a = McMappingDatabase.getSRG("ItemKnowledgeBook.func_77659_a");

}
