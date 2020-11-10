package io.openems.edge.goodwe.ess.applypower;

import io.openems.edge.common.statemachine.StateHandler;
import io.openems.edge.goodwe.ess.applypower.ApplyPowerStateMachine.State;
import io.openems.edge.goodwe.ess.enums.PowerModeEms;

public class EtFullPositiveDischargeHandler extends StateHandler<State, Context> {

	@Override
	public State runAndGetNextState(Context context) {
		context.setMode(PowerModeEms.DISCHARGE_BAT, context.activePowerSetPoint - context.pvProduction);

		return State.ET_FULL_POSITIVE_DISCHARGE;
	}

}
