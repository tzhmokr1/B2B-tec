package ch.b2btec.ui;

import ch.b2btec.ui.generated.ShoppingCartSummaryPanelBase;
import ch.b2btec.ui.models.ShoppingCartModel;

public class ShoppingCartSummaryPanel extends ShoppingCartSummaryPanelBase {

	private static final long serialVersionUID = 4330488678985082419L;

	private ShoppingCartModel model;

	public ShoppingCartSummaryPanel(ShoppingCartModel model) {
		this.model = model;
		updateValues();
	}

	private void updateValues() {
		itemsInCartLabel.setText(Integer.toString(model.getTotalNumberOfItems()));
		totalPriceLabel.setText(Integer.toString(model.getTotalPrice()));
		
	}

}
