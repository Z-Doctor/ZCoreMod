package zdoctor.zcoremod.map.minecraft.client.resources.data;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AnimationMetadataSectionSerializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfj";
		else
			return "net/minecraft/client/resources/data/AnimationMetadataSectionSerializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfj";
		else
			return "AnimationMetadataSectionSerializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcfj;";
		else
			return "Lnet/minecraft/client/resources/data/AnimationMetadataSectionSerializer;";
	}

	/**
	 * <p>
	 * Name: getSectionName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_110483_a = McMappingDatabase.getSRG("AnimationMetadataSectionSerializer.func_110483_a");

	/**
	 * <p>
	 * Name: parseAnimationFrame
	 * </p>
	 * <p>
	 * Desc: [(ILcom/google/gson/JsonElement;)Lnet/minecraft/client/resources/data/AnimationFrame;]
	 * </p>
	 */
	public static McObfPair func_110492_a = McMappingDatabase.getSRG("AnimationMetadataSectionSerializer.func_110492_a");

}
