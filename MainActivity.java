<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/V"
    android:paddingTop="@dimen/V"
    android:paddingRight="@dimen/H"
    android:paddingLeft="@dimen/H">


    <Button
        android:id="@+id/buttonScann"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Scan QR Code"
        android:layout_alignParentBottom="true"/>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:layout_centerVertical="true">


        <TextView
            android:id="@+id/textView"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Nama" />

        <TextView
            android:id="@+id/textViewNama"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="xyz"
            android:textAppearance="@style/TextAppearance.AppCompat.Large"/>

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Kelas" />

        <TextView
            android:id="@+id/textViewKelas"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="xyz"
            android:textAppearance="@style/TextAppearance.AppCompat.Large"/>

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="NIM" />

        <TextView
            android:id="@+id/textViewNIM"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="xyz"
            android:textAppearance="@style/TextAppearance.AppCompat.Large"/>

    </LinearLayout>



</RelativeLayout>
