package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldServerMulti {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ok";
		else
			return "net/minecraft/world/WorldServerMulti";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ok";
		else
			return "WorldServerMulti";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lok;";
		else
			return "Lnet/minecraft/world/WorldServerMulti;";
	}

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_175643_b = McMappingDatabase.getSRG("WorldServerMulti.func_175643_b");

	/**
	 * <p>
	 * Name: saveAdditionalData
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184166_c = McMappingDatabase.getSRG("WorldServerMulti.func_184166_c");

	/**
	 * <p>
	 * Name: delegate
	 * </p>
	 */
	public static McObfPair field_175743_a = McMappingDatabase.getSRG("field_175743_a");

	/**
	 * <p>
	 * Name: saveLevel
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73042_a = McMappingDatabase.getSRG("WorldServerMulti.func_73042_a");

}
