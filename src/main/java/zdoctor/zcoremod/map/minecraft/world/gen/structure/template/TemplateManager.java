package zdoctor.zcoremod.map.minecraft.world.gen.structure.template;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TemplateManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcg";
		else
			return "net/minecraft/world/gen/structure/template/TemplateManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcg";
		else
			return "TemplateManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcg;";
		else
			return "Lnet/minecraft/world/gen/structure/template/TemplateManager;";
	}

	/**
	 * <p>
	 * Name: getTemplate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/world/gen/structure/template/Template;]
	 * </p>
	 */
	public static McObfPair func_186237_a = McMappingDatabase.getSRG("TemplateManager.func_186237_a");

	/**
	 * <p>
	 * Name: templates
	 * </p>
	 */
	public static McObfPair field_186240_a = McMappingDatabase.getSRG("field_186240_a");

	/**
	 * <p>
	 * Name: remove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)V]
	 * </p>
	 */
	public static McObfPair func_189941_a = McMappingDatabase.getSRG("TemplateManager.func_189941_a");

	/**
	 * <p>
	 * Name: readTemplateFromJar
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Z]
	 * </p>
	 */
	public static McObfPair func_186236_a = McMappingDatabase.getSRG("TemplateManager.func_186236_a");

	/**
	 * <p>
	 * Name: readTemplateFromStream
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/io/InputStream;)V]
	 * </p>
	 */
	public static McObfPair func_186239_a = McMappingDatabase.getSRG("TemplateManager.func_186239_a");

	/**
	 * <p>
	 * Name: readTemplate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Z]
	 * </p>
	 */
	public static McObfPair func_186235_b = McMappingDatabase.getSRG("TemplateManager.func_186235_b");

	/**
	 * <p>
	 * Name: fixer
	 * </p>
	 */
	public static McObfPair field_191154_c = McMappingDatabase.getSRG("field_191154_c");

	/**
	 * <p>
	 * Name: baseFolder
	 * </p>
	 */
	public static McObfPair field_186241_b = McMappingDatabase.getSRG("field_186241_b");

	/**
	 * <p>
	 * Name: writeTemplate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/util/ResourceLocation;)Z]
	 * </p>
	 */
	public static McObfPair func_186238_c = McMappingDatabase.getSRG("TemplateManager.func_186238_c");

	/**
	 * <p>
	 * Name: get
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/world/gen/structure/template/Template;]
	 * </p>
	 */
	public static McObfPair func_189942_b = McMappingDatabase.getSRG("TemplateManager.func_189942_b");

}
