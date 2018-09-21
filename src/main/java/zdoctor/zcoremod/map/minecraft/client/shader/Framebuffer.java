package zdoctor.zcoremod.map.minecraft.client.shader;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Framebuffer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvd";
		else
			return "net/minecraft/client/shader/Framebuffer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvd";
		else
			return "Framebuffer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvd;";
		else
			return "Lnet/minecraft/client/shader/Framebuffer;";
	}

	/**
	 * <p>
	 * Name: unbindFramebufferTexture
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147606_d = McMappingDatabase.getSRG("Framebuffer.func_147606_d");

	/**
	 * <p>
	 * Name: unbindFramebuffer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147609_e = McMappingDatabase.getSRG("Framebuffer.func_147609_e");

	/**
	 * <p>
	 * Name: bindFramebuffer
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_147610_a = McMappingDatabase.getSRG("Framebuffer.func_147610_a");

	/**
	 * <p>
	 * Name: framebufferFilter
	 * </p>
	 */
	public static McObfPair field_147623_j = McMappingDatabase.getSRG("field_147623_j");

	/**
	 * <p>
	 * Name: framebufferWidth
	 * </p>
	 */
	public static McObfPair field_147621_c = McMappingDatabase.getSRG("field_147621_c");

	/**
	 * <p>
	 * Name: setFramebufferColor
	 * </p>
	 * <p>
	 * Desc: [(FFFF)V]
	 * </p>
	 */
	public static McObfPair func_147604_a = McMappingDatabase.getSRG("Framebuffer.func_147604_a");

	/**
	 * <p>
	 * Name: framebufferHeight
	 * </p>
	 */
	public static McObfPair field_147618_d = McMappingDatabase.getSRG("field_147618_d");

	/**
	 * <p>
	 * Name: framebufferClear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147614_f = McMappingDatabase.getSRG("Framebuffer.func_147614_f");

	/**
	 * <p>
	 * Name: deleteFramebuffer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147608_a = McMappingDatabase.getSRG("Framebuffer.func_147608_a");

	/**
	 * <p>
	 * Name: createBindFramebuffer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_147613_a = McMappingDatabase.getSRG("Framebuffer.func_147613_a");

	/**
	 * <p>
	 * Name: createFramebuffer
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_147605_b = McMappingDatabase.getSRG("Framebuffer.func_147605_b");

	/**
	 * <p>
	 * Name: bindFramebufferTexture
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147612_c = McMappingDatabase.getSRG("Framebuffer.func_147612_c");

	/**
	 * <p>
	 * Name: framebufferTextureWidth
	 * </p>
	 */
	public static McObfPair field_147622_a = McMappingDatabase.getSRG("field_147622_a");

	/**
	 * <p>
	 * Name: framebufferTextureHeight
	 * </p>
	 */
	public static McObfPair field_147620_b = McMappingDatabase.getSRG("field_147620_b");

	/**
	 * <p>
	 * Name: framebufferRenderExt
	 * </p>
	 * <p>
	 * Desc: [(IIZ)V]
	 * </p>
	 */
	public static McObfPair func_178038_a = McMappingDatabase.getSRG("Framebuffer.func_178038_a");

	/**
	 * <p>
	 * Name: framebufferObject
	 * </p>
	 */
	public static McObfPair field_147616_f = McMappingDatabase.getSRG("field_147616_f");

	/**
	 * <p>
	 * Name: useDepth
	 * </p>
	 */
	public static McObfPair field_147619_e = McMappingDatabase.getSRG("field_147619_e");

	/**
	 * <p>
	 * Name: setFramebufferFilter
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_147607_a = McMappingDatabase.getSRG("Framebuffer.func_147607_a");

	/**
	 * <p>
	 * Name: checkFramebufferComplete
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147611_b = McMappingDatabase.getSRG("Framebuffer.func_147611_b");

	/**
	 * <p>
	 * Name: framebufferRender
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_147615_c = McMappingDatabase.getSRG("Framebuffer.func_147615_c");

	/**
	 * <p>
	 * Name: framebufferTexture
	 * </p>
	 */
	public static McObfPair field_147617_g = McMappingDatabase.getSRG("field_147617_g");

	/**
	 * <p>
	 * Name: framebufferColor
	 * </p>
	 */
	public static McObfPair field_147625_i = McMappingDatabase.getSRG("field_147625_i");

	/**
	 * <p>
	 * Name: depthBuffer
	 * </p>
	 */
	public static McObfPair field_147624_h = McMappingDatabase.getSRG("field_147624_h");

}
