package case3;

import java.time.LocalTime;

public class SignalMonitor {

	private Runnable callback = () -> {
		System.out.println(LocalTime.now() + ": SignalMonitor callback received");
	};
	private SignalEmitterInterface emitter;

	public SignalMonitor(SignalEmitterInterface emitter) {
		this.emitter = emitter;
		emitter.subscribeForSignal(callback);
	}

	public void disable() {
		emitter.unsubscribeFromSignal(callback);
	}

}
