// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class GridListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final AppCompatImageView imageView;

  @NonNull
  public final TextView tvAgeDog;

  @NonNull
  public final TextView tvHobiesDog;

  @NonNull
  public final TextView tvNameDog;

  private GridListItemBinding(@NonNull MaterialCardView rootView,
      @NonNull AppCompatImageView imageView, @NonNull TextView tvAgeDog,
      @NonNull TextView tvHobiesDog, @NonNull TextView tvNameDog) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.tvAgeDog = tvAgeDog;
    this.tvHobiesDog = tvHobiesDog;
    this.tvNameDog = tvNameDog;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.grid_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GridListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image_view;
      AppCompatImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.tv_age_dog;
      TextView tvAgeDog = ViewBindings.findChildViewById(rootView, id);
      if (tvAgeDog == null) {
        break missingId;
      }

      id = R.id.tv_hobies_dog;
      TextView tvHobiesDog = ViewBindings.findChildViewById(rootView, id);
      if (tvHobiesDog == null) {
        break missingId;
      }

      id = R.id.tv_name_dog;
      TextView tvNameDog = ViewBindings.findChildViewById(rootView, id);
      if (tvNameDog == null) {
        break missingId;
      }

      return new GridListItemBinding((MaterialCardView) rootView, imageView, tvAgeDog, tvHobiesDog,
          tvNameDog);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
