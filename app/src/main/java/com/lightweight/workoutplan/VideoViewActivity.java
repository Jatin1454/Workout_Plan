package com.lightweight.workoutplan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.VideoView;

import pl.droidsonroids.gif.GifImageView;

public class VideoViewActivity extends AppCompatActivity {

    TextView textView;
    GifImageView gifImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        gifImageView=findViewById(R.id.gif);
        textView=findViewById(R.id.textView);

        Intent intent=getIntent();
        String exerciseName=intent.getStringExtra("exerciseName").toString();
        int exerciseImage=intent.getIntExtra("exerciseImage",0);

        if(exerciseName.equalsIgnoreCase("Pull Ups")){
            gifImageView.setImageResource(R.drawable.pull_up);
            textView.setText("A pull-up is an upper-body strength exercise. The pull-up is a closed-chain movement where the body is suspended by the hands, gripping a bar or other implement at a distance typically wider than shoulder-width, and pulled up.");
        }
        else if(exerciseName.equalsIgnoreCase("Lat Pull Down")){
            gifImageView.setImageResource(R.drawable.back2);
            textView.setText("The pull-down exercise is a strength training exercise designed to develop the latissimus dorsi muscle. It performs the functions of downward rotation and depression of the scapulae combined with adduction and extension of the shoulder joint.");
        }
        else if (exerciseImage==R.drawable.seated_cable_row) {
            gifImageView.setImageResource(R.drawable.back3);
            textView.setText("Seated cable rows focuses on back muscles. It also helps to develop the strength in the muscles of the biceps, forearms and shoulders. ");
        }
        else if (exerciseImage==R.drawable.chest_supported_row) {
            gifImageView.setImageResource(R.drawable.back4);
            textView.setText("This exercise is a brilliant way to target your back, building strength and size in a range of back muscles and upper bodylats. Depending on the position of your arm, this exercise can target different muscles.");
        }
        else if (exerciseImage==R.drawable.dumbbell_pullover) {
            gifImageView.setImageResource(R.drawable.back5);
            textView.setText("The pullover is an exercise that is performed with either a dumbbell or a barbell.[1] Pullovers can be made to affect either the chest or the back depending on how wide the grip is (barbell) and the position of the shoulders.");
        }
        else if (exerciseImage==R.drawable.bent_over_db_row) {
            gifImageView.setImageResource(R.drawable.back6);
            textView.setText("This exercise is frequently performed with one knee and one hand on the same side of the body braced on a bench with the back straight and parallel to the ground, and the other hand holding a weight with the arm extended.");
        }
//        *************************************************************************************
        else if (exerciseImage==R.drawable.incline_dumbbell_curl) {
            gifImageView.setImageResource(R.drawable.biceps1);
            textView.setText("Sit with your back flat against the bench, your abs tight, and the weights by your sides (one in each hand). With your palms facing up, curl the dumbbells until they reach your shoulders. Keep squeezing your biceps at the top of the movement for a full contraction.");
        }
        else if (exerciseImage==R.drawable.preacher_curl) {
            gifImageView.setImageResource(R.drawable.biceps2);
            textView.setText("Sit on a preacher bench and adjust the seat height to an optimal position. Keep the back of upper arms tightly attached to the preacher bench with a barbell hold by both hands. Flex the elbows until they are almost fully extended and curl the barbell towards shoulder until the biceps are fully contracted.");
        }
        else if (exerciseImage==R.drawable.barbell_curl) {
            gifImageView.setImageResource(R.drawable.biceps3);
            textView.setText("A bicep curl usually starts with the arm in a fully extended position, holding a weight with a supinated (palms facing up) grip. A full repetition consists of bending or \"curling\" the elbow until it is fully flexed, then slowly lowering the weight to the starting position.");
        }
        else if (exerciseImage==R.drawable.cable_bicep_curl) {
            gifImageView.setImageResource(R.drawable.biceps4);
            textView.setText(" Hold the bar that is attached to a pulley at the lowest level in a standing position, step a foot back from the pulley to create a comfortable angle for this exercise. Keep the elbows to the side of the torso and shoulders are fixed, then raise the bar towards shoulder until biceps are fully contracted. Return the bar back to the initial position for another repetition.");
        }
//        ************************************************************************************
        else if (exerciseName.equalsIgnoreCase("Push Ups")) {
            gifImageView.setImageResource(R.drawable.chest1);
            textView.setText("The push-up is a common calisthenics exercise beginning from the prone position. By raising and lowering the body using the arms, push-ups exercise the pectoral muscles, triceps, and anterior deltoids.");
        }
        else if (exerciseImage==R.drawable.bench_press) {
            gifImageView.setImageResource(R.drawable.chest2);
            textView.setText("The bench press, or chest press, is a weight training exercise where a person presses a weight upwards while lying horizontally on a weight training bench.");
        }
        else if (exerciseImage==R.drawable.incline_bench_press) {
            gifImageView.setImageResource(R.drawable.chest3);
            textView.setText("The incline bench press is a variation of the bench press and an exercise used to build the muscles of the chest. The shoulders and triceps will be indirectly involved as well.");
        }
        else if (exerciseImage==R.drawable.incline_dumbbell_fly) {
            gifImageView.setImageResource(R.drawable.chest4);
            textView.setText("The incline dumbbell press is a free weight exercise designed to target the chest, shoulders, and triceps, independently hitting each side of the body.");
        }
        else if (exerciseImage==R.drawable.machine_chest_fly) {
            gifImageView.setImageResource(R.drawable.chest5);
            textView.setText("The machine fly is a chest fly variation which uses a fixed weight machine to replicate the fly movement and challenge the pectorals, deltoids, and triceps.");
        }
        else if (exerciseImage==R.drawable.chest_press) {
            textView.setText("The chest press is a classic upper-body strengthening exercise that works your pectorals (chest), deltoids (shoulders), and triceps (arms). For the best results and safety, it’s essential that you use proper form and good technique.");
            gifImageView.setImageResource(R.drawable.chest6);
        }
//        ****************************************************************************

        else if (exerciseImage==R.drawable.tricep_rope_pushdown) {
            textView.setText("A push-down is a strength training exercise used for strengthening the triceps muscles in the back of the arm. This exercise can also be called a tricep push-down or a two armed standing tricep extension.");
            gifImageView.setImageResource(R.drawable.tri1);
        }
        else if (exerciseImage==R.drawable.cable_overhead_extensions) {
            textView.setText("The overhead Cable tricep extension is an isolation exercise that works the muscle on the back of the upper arm, known as the triceps. This exercise requires a cable machine, a tricep rope attachment, and weight plates.");
            gifImageView.setImageResource(R.drawable.tri2);
        }
        else if (exerciseImage==R.drawable.tricep_kickback) {
            textView.setText("The tricep dumbbell kickback is a versatile and effective exercise that targets the triceps muscles in the back of your arms. The triceps are one of the most important muscles involved in upper body stability and conditioning.");
            gifImageView.setImageResource(R.drawable.tri3);
        }
//        *******************************************************************************************

        else if (exerciseImage==R.drawable.hanging_knee_raise) {
            gifImageView.setImageResource(R.drawable.core1);
            textView.setText("Hanging knee raises are a bodyweight exercise that targets your central core and lower abs. You do them by lifting and lowering your knees while hanging on a pull-up bar. Hanging knee raises require great upper-body strength.");
        }
        else if (exerciseImage==R.drawable.crunches) {
            textView.setText("The crunch is an abdominal exercise that works the rectus abdominis muscle. It enables both building \"six-pack\" abs and tightening the belly. Crunches use the exerciser's own body weight to tone muscle.");
            gifImageView.setImageResource(R.drawable.core2);
        }
        else if (exerciseImage==R.drawable.plank) {
            textView.setText("The most common plank is the forearm plank which is held in a push-up-like position, with the body's weight borne on forearms, elbows, and toes.");
            gifImageView.setImageResource(R.drawable.core3);
        }
        else if (exerciseImage==R.drawable.russian_twist) {
            gifImageView.setImageResource(R.drawable.core4);
            textView.setText("The Russian twist is a simple abdominal exercise for working the core, shoulders, and hips. It is typically performed in repetitive sets and tones the core muscles via a twisting motion focused around the abdomen.");
        }
        else if (exerciseImage==R.drawable.core5) {
            gifImageView.setImageResource(R.drawable.core5);
            textView.setText("Hold the weight against your chest and lie on your back. Bend your knees at a 90-degree angle, and keep your feet firmly planted on the floor. While holding the weight, slowly contract your core and raise your upper body toward your knees until your forearms touch your thighs.");
        }
        else if (exerciseImage==R.drawable.superman_hold) {
            gifImageView.setImageResource(R.drawable.core6);
            textView.setText("Lie on the floor in a prone (facedown) position, with your legs straight and your arms extended in front of you. Keeping your head in a neutral position (avoid looking up), slowly lift your arms and legs around 6 inches (15.3 cm) off the floor, or until you feel your lower back muscles contracting.");
        }
//        *******************************************************************************************

        else if (exerciseImage==R.drawable.shoulder_press) {
            gifImageView.setImageResource(R.drawable.sh1);
            textView.setText("The shoulder press is an upper-body weight training exercise in which the trainee presses a weight overhead while seated or standing. It is mainly used to develop the anterior deltoid muscles of the shoulder.");
        }
        else if (exerciseImage==R.drawable.arnold_press) {
            gifImageView.setImageResource(R.drawable.sh2);
            textView.setText("Grab a set of dumbbells and stand with your legs shoulder-width apart. Raise the dumbbells to shoulder height with your palms facing your body. Keep your back straight and bend your knees slightly. Slowly push the dumbbells above your head while rotating your wrists 180 degrees.");
        }
        else if (exerciseImage==R.drawable.seated_bent_over_dumbbell_reverse_fly) {
            gifImageView.setImageResource(R.drawable.sh3);
            textView.setText("The seated bent over dumbbell reverse fly is a dumbbell reverse fly variation and an exercise used to strength then rear deltoids.");
        }
        else if (exerciseImage==R.drawable.dumbbell_front_raise) {
            gifImageView.setImageResource(R.drawable.sh4);
            textView.setText("The front raise, also known as the dumbbell front raise, is a weight training exercise that targets your shoulder muscles. Perform front raises by standing and using an overhand grip to lift a pair of dumbbells from the front of your thighs to shoulder level in front of your body.");
        }
//       ********************************************************************************************

        else if (exerciseImage==R.drawable.dealt_fly) {
            gifImageView.setImageResource(R.drawable.rear1);
            textView.setText("The rear delt fly, also known as the rear delt raise or the bent-over dumbbell reverse fly, is a weight training exercise that targets your upper back muscles and shoulder muscles, particularly the posterior deltoids, or rear deltoids, on the backside of your shoulders.");
        }
//        *********************************************************************************************

        else if (exerciseImage==R.drawable.dumbbell_shrug) {
            gifImageView.setImageResource(R.drawable.trap1);
            textView.setText("Dumbbell shrugs, also known as dumbbell shoulder shrugs, are an isolation exercise targeting your upper trapezius muscles. Perform dumbbell shrugs by grabbing a pair of dumbbells and holding them by your sides with a neutral grip.");
        }
        else if (exerciseImage==R.drawable.upright_row) {
            gifImageView.setImageResource(R.drawable.traps2);
            textView.setText("The upright row is a weight training exercise performed by holding a weight with an overhand grip and lifting it straight up to the collarbone. This is a compound exercise that involves the trapezius, the deltoids and the biceps.");
        }
        else if (exerciseImage==R.drawable.face_pulls) {
            gifImageView.setImageResource(R.drawable.trap3);
            textView.setText("The face pull is an isolation exercise that activates muscles in your lower back and upper back—specifically the rear deltoids on the back of your shoulders. Practice face pulls by standing in front of a cable pulley machine. Grab the rope attachment with an overhand grip.");
        }

//      **********************************************************************************************

        else if (exerciseImage==R.drawable.bodyweight_squat) {
            gifImageView.setImageResource(R.drawable.leg1);
            textView.setText("The bodyweight squat involves shifting your hips back and \"sitting\" toward the ground while in a standing position, stopping once your thighs are parallel with the ground, then pushing through the heels to straighten your legs and return to standing.");
        }else if (exerciseImage==R.drawable.squat) {
            gifImageView.setImageResource(R.drawable.leg2);
            textView.setText("Take a deep breath and unrack a weighted barbell, holding it on your upper back. Keep your chest up and your back straight as you hinge your hips and knees to lower your body through a full range of motion into a squat position.");
        }else if (exerciseImage==R.drawable.lunges) {
            gifImageView.setImageResource(R.drawable.leg3);
            textView.setText("A lunge can refer to any position of the human body where one leg is positioned forward with knee bent and foot flat on the ground while the other leg is positioned behind.");
        }else if (exerciseImage==R.drawable.leg_press) {
            gifImageView.setImageResource(R.drawable.leg4);
            textView.setText("Leg presses are seated exercises done on a leg press machine. To start, sit with your back against a padded backrest and your feet on two large footrests. Your knees are bent to start the exercise. To move the weight, you must straighten your legs and then return them to the bent position.");
        }else if (exerciseImage==R.drawable.leg_extension) {
            gifImageView.setImageResource(R.drawable.leg5);
            textView.setText("Leg extensions are done on a leg extension machine. You sit on the machine with a weighted pad on top of your lower legs. Then you use your quads to repeatedly extend your knees and lift your lower legs. While the leg extension is a great quad workout, it might not be the most practical move.");
        }else if (exerciseImage==R.drawable.leg_curls) {
            gifImageView.setImageResource(R.drawable.leg6);
            textView.setText("The leg curl, is an exercise that strengthens the hamstrings. It involves bending your knees and moving your heels toward your butt while the rest of your body stays still.");
        }else if (exerciseImage==R.drawable.calf_raises) {
            gifImageView.setImageResource(R.drawable.leg7);
            textView.setText("To do a calf raise with dumbbells, hold a dumbbell in each hand and stand with your feet about shoulder-width apart. Let your arms hang straight below your shoulders. Rise up onto your toes, then slowly return to the starting position. You'll feel tension in the muscles in the back of your lower legs.");
        }
//        ************************************************************************************
        else if (exerciseImage==R.drawable.wrist_gif_1) {
            gifImageView.setImageResource(R.drawable.wrist_gif_1);
            textView.setText("The wrist curl is a weight training exercise for developing just the wrist flexor muscles of the forearm. It is therefore an isolation exercise. Ideally, it should be done in combination with the \"reverse wrist curl\" to ensure equal development of the wrist flexor and wrist extensor muscles.");
        }
        else if (exerciseImage==R.drawable.wrist_curl) {
            gifImageView.setImageResource(R.drawable.wrist_curl);
            textView.setText("Standing tall, place a barbell behind your back, your hands shoulder-width apart and your palms facing behind you. Your arms should be fully extended so the bar rests just below your glutes. Flexing your wrists, curl the barbell toward your body. Pause, then lower the bar to the starting position.");
        }
        else if (exerciseImage==R.drawable.reverse_wrist_curl) {
            gifImageView.setImageResource(R.drawable.reverse_wrist_curl);
            textView.setText("Once you master regular wrist curls, try reverse wrist curls. Instead of having your palms face up, this exercise involves your palms facing down, toward the floor. The rest of the movement is the same. This variation does target the wrists more than the forearms.");
        }
    }
}