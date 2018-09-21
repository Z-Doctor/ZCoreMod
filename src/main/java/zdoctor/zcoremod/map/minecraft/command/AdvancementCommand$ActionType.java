package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AdvancementCommand$ActionType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "br$a";
		else
			return "net/minecraft/command/AdvancementCommand$ActionType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "br$a";
		else
			return "AdvancementCommand$ActionType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbr$a;";
		else
			return "Lnet/minecraft/command/AdvancementCommand$ActionType;";
	}

	/**
	 * <p>
	 * Name: wrongUsage
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/command/CommandException;]
	 * </p>
	 */
	public static McObfPair func_193534_a = McMappingDatabase.getSRG("AdvancementCommand$ActionType.func_193534_a");

	/**
	 * <p>
	 * Name: perform
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Ljava/lang/Iterable;)I]
	 * </p>
	 */
	public static McObfPair func_193532_a = McMappingDatabase.getSRG("AdvancementCommand$ActionType.func_193532_a");

	/**
	 * <p>
	 * Name: baseTranslationKey
	 * </p>
	 */
	public static McObfPair field_193541_d = McMappingDatabase.getSRG("field_193541_d");

	/**
	 * <p>
	 * Name: performCriterion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/advancements/Advancement;Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_193535_a = McMappingDatabase.getSRG("AdvancementCommand$ActionType.func_193535_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_193540_c = McMappingDatabase.getSRG("field_193540_c");

	/**
	 * <p>
	 * Name: perform
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/advancements/Advancement;)Z]
	 * </p>
	 */
	public static McObfPair func_193537_a = McMappingDatabase.getSRG("AdvancementCommand$ActionType.func_193537_a");

	/**
	 * <p>
	 * Name: byName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/command/AdvancementCommand$ActionType;]
	 * </p>
	 */
	public static McObfPair func_193536_a = McMappingDatabase.getSRG("AdvancementCommand$ActionType.func_193536_a");

}
