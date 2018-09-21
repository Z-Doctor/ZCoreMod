package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderGlobal$ContainerLocalRenderInformation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buy$a";
		else
			return "net/minecraft/client/renderer/RenderGlobal$ContainerLocalRenderInformation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buy$a";
		else
			return "RenderGlobal$ContainerLocalRenderInformation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbuy$a;";
		else
			return "Lnet/minecraft/client/renderer/RenderGlobal$ContainerLocalRenderInformation;";
	}

	/**
	 * <p>
	 * Name: renderChunk
	 * </p>
	 */
	public static McObfPair field_178036_a = McMappingDatabase.getSRG("field_178036_a");

	/**
	 * <p>
	 * Name: counter
	 * </p>
	 */
	public static McObfPair field_178032_d = McMappingDatabase.getSRG("field_178032_d");

	/**
	 * <p>
	 * Name: setDirection
	 * </p>
	 * <p>
	 * Desc: [(BLnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_189561_a = McMappingDatabase.getSRG("RenderGlobal$ContainerLocalRenderInformation.func_189561_a");

	/**
	 * <p>
	 * Name: hasDirection
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_189560_a = McMappingDatabase.getSRG("RenderGlobal$ContainerLocalRenderInformation.func_189560_a");

	/**
	 * <p>
	 * Name: setFacing
	 * </p>
	 */
	public static McObfPair field_178035_c = McMappingDatabase.getSRG("field_178035_c");

	/**
	 * <p>
	 * Name: facing
	 * </p>
	 */
	public static McObfPair field_178034_b = McMappingDatabase.getSRG("field_178034_b");

}
