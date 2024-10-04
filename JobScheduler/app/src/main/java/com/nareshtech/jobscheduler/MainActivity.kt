package com.nareshtech.jobscheduler

import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.content.ComponentName
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var jobInfo: JobInfo
    lateinit var jobScheduler: JobScheduler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        jobScheduler = getSystemService(JOB_SCHEDULER_SERVICE) as JobScheduler

        // set the conditions
        jobInfo = JobInfo.Builder(12, ComponentName(packageName,MyJobService::class.java.name))
            .setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY)
            .build()
    }

    fun scheduleJob(view: View) {
        jobScheduler.schedule(jobInfo)
    }

    // Three components are needed
    // 1 JobService
    // 2. JobInfo
    // 3. JobScheduler
}