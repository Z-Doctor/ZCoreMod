package zdoctor.zcoremod;

import com.google.common.eventbus.EventBus;

import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;

public class CoreModContainer extends DummyModContainer {

	public CoreModContainer() {
		super(new CoreModMetaData());
	}

	@Override
	public boolean registerBus(EventBus bus, LoadController controller) {
		bus.register(this);
		return true;
	}

	@Override
	public Object getMod() {
		return this;
	}

}
