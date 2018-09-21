package zdoctor.zcoremod.map.minecraft.client.audio;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ISound$AttenuationType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgt$a";
		else
			return "net/minecraft/client/audio/ISound$AttenuationType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgt$a";
		else
			return "ISound$AttenuationType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgt$a;";
		else
			return "Lnet/minecraft/client/audio/ISound$AttenuationType;";
	}

	/**
	 * <p>
	 * Name: getTypeInt
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_148586_a = McMappingDatabase.getSRG("ISound$AttenuationType.func_148586_a");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_148589_c = McMappingDatabase.getSRG("field_148589_c");

}
