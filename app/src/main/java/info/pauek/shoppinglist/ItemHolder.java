package info.pauek.shoppinglist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class ItemHolder extends RecyclerView.ViewHolder {
    private CheckBox check_box;
    private boolean checked;

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }



    public ItemHolder(@NonNull View itemView, final ShoppingListAdapter.OnClickListener onClickListener) {
        super(itemView);
        check_box = itemView.findViewById(R.id.check_box);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onClickListener != null) {
                    int pos = getAdapterPosition();
                    onClickListener.onClick(pos);
                }
            }
        });
    }

    public void bind(ShoppingItem item) {
        check_box.setText(item.getName());
    }
}
