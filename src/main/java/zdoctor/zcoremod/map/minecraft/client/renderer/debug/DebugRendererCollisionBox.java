package zdoctor.zcoremod.map.minecraft.client.renderer.debug;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DebugRendererCollisionBox {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byf";
		else
			return "net/minecraft/client/renderer/debug/DebugRendererCollisionBox";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byf";
		else
			return "DebugRendererCollisionBox";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbyf;";
		else
			return "Lnet/minecraft/client/renderer/debug/DebugRendererCollisionBox;";
	}

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(FJ)V]
	 * </p>
	 */
	public static McObfPair func_190060_a = McMappingDatabase.getSRG("DebugRendererCollisionBox.func_190060_a");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_191313_b = McMappingDatabase.getSRG("field_191313_b");

	/**
	 * <p>
	 * Name: minecraft
	 * </p>
	 */
	public static McObfPair field_191312_a = McMappingDatabase.getSRG("field_191312_a");

	/**
	 * <p>
	 * Name: renderPosZ
	 * </p>
	 */
	public static McObfPair field_191316_e = McMappingDatabase.getSRG("field_191316_e");

	/**
	 * <p>
	 * Name: renderPosX
	 * </p>
	 */
	public static McObfPair field_191314_c = McMappingDatabase.getSRG("field_191314_c");

	/**
	 * <p>
	 * Name: renderPosY
	 * </p>
	 */
	public static McObfPair field_191315_d = McMappingDatabase.getSRG("field_191315_d");

}
