package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AdvancementCommand$ActionType$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "br$a$1";
		else
			return "net/minecraft/command/AdvancementCommand$ActionType$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "br$a$1";
		else
			return "AdvancementCommand$ActionType$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbr$a$1;";
		else
			return "Lnet/minecraft/command/AdvancementCommand$ActionType$1;";
	}

	/**
	 * <p>
	 * Name: perform
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/advancements/Advancement;)Z]
	 * </p>
	 */
	public static McObfPair func_193537_a = McMappingDatabase.getSRG("AdvancementCommand$ActionType$1.func_193537_a");

	/**
	 * <p>
	 * Name: performCriterion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/advancements/Advancement;Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_193535_a = McMappingDatabase.getSRG("AdvancementCommand$ActionType$1.func_193535_a");

}
