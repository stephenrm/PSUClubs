package com.stephen.psuclubs;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.List;

public class MyGlobals {
    Context mContext;

    // constructor
    public MyGlobals(Context context){
        this.mContext = context;
    }


   List getIdList(){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        return null;
    }

    void sendList(final MainActivity activity){
        Log.d("testing","called");
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("clubs").get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        Log.d("testing","completed");
                        if (task.isSuccessful()) {
                            activity.receiveClubsList(task.getResult().toObjects(Club.class));
                            //Log.d("testing", ((Club)(returnList[0].get(0))).getName());
                            //for (QueryDocumentSnapshot document : task.getResult()) {
                            //    Log.d("testing", document.getId() + " => " + document.getData());
                            //}
                        } else {
                            Log.d("testing", "Error getting documents: ", task.getException());
                        }
                    }
                });
    }

    public void addClub(Club clubToAdd){
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        db.collection("clubs").add(clubToAdd)
        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                Log.d("testing", "DocumentSnapshot written with ID: " + documentReference.getId());
            }
        })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w("testing", "Error adding document", e);
                    }
                });
    }


}
