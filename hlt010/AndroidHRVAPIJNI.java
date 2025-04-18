/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.wbd101.hlt010;
//calling native methods from the SO file, which allows android appllications to call them
// These will allocate the specific function/ which is coded with a specific task
//They will retrieve the answer to the specific task and return presumably a pointer to the hrv_result_t class
//All these are part of the hrv_result_t class and returns specific scores: stress, hrv score etc
public class AndroidHRVAPIJNI {
  public final static native long hrv_result_t_total_rr_cnt_get(long jarg1, hrv_result_t jarg1_); //Returns the rr count
  public final static native int hrv_result_t_window_rr_cnt_get(long jarg1, hrv_result_t jarg1_); // Returns the rr count in a certain time interval
  public final static native int hrv_result_t_valid_rr_cnt_get(long jarg1, hrv_result_t jarg1_); // Returns the amount of valid rr counts
  public final static native int hrv_result_t_result_timestamp_get(long jarg1, hrv_result_t jarg1_); // Some kind of time interval, maybe for the rr count?
  public final static native byte hrv_result_t_result_conf_level_get(long jarg1, hrv_result_t jarg1_); //
  public final static native short hrv_result_t_stress_index_get(long jarg1, hrv_result_t jarg1_); // A measurement for stress level
  public final static native byte hrv_result_t_pNN50_get(long jarg1, hrv_result_t jarg1_); // A percentage of consecutive normal cardiac interbeats that has happened at an interval of 50ms
  public final static native float hrv_result_t_rMSSD_get(long jarg1, hrv_result_t jarg1_); // A root mean square of the time difference between normal cardiac interbeats
  public final static native float hrv_result_t_SDNN180_get(long jarg1, hrv_result_t jarg1_); // The standard deviation of RR intervals over a 180 second window
  public final static native float hrv_result_t_HRV_Score_get(long jarg1, hrv_result_t jarg1_); // Overall HRV Score, defined in the SO files
  // Detrended Fluctuation Analysis Slope. used in HRV analysis to analyze the fractal-like properties 
  public final static native float hrv_result_t_dfa_slope1_get(long jarg1, hrv_result_t jarg1_); // Slope 1 most likely represents the short term fluctuations of the heart rate signal
  public final static native float hrv_result_t_dfa_slope2_get(long jarg1, hrv_result_t jarg1_); // Slope 2 most likely reflects the long-term fluctuations of the heart rate signal
  public final static native byte hrv_result_t_respiratory_rate_get(long jarg1, hrv_result_t jarg1_); //The respiratory rate
  public final static native float hrv_result_t_vlf_get(long jarg1, hrv_result_t jarg1_); // Very Low Frequency of the hrv
  public final static native float hrv_result_t_lf_get(long jarg1, hrv_result_t jarg1_); // Low frequency of the hrv
  public final static native float hrv_result_t_hf_get(long jarg1, hrv_result_t jarg1_); // High frequency of the hrv
  public final static native float hrv_result_t_lf_nu_get(long jarg1, hrv_result_t jarg1_); //Normalized value of the lhrv
  public final static native float hrv_result_t_hf_nu_get(long jarg1, hrv_result_t jarg1_); // Normalized value of the hhrv
  public final static native float hrv_result_t_lf_to_hf_get(long jarg1, hrv_result_t jarg1_); // Some kind of ratio between low and high frequency 
  public final static native float hrv_result_t_total_power_get(long jarg1, hrv_result_t jarg1_); // Power????
  public final static native long new_hrv_result_t(); //Creating a new memory location for a new set of hrv_result_t data
  public final static native void delete_hrv_result_t(long jarg1); //Deletes the memory previously allocated for hrv_result_t
  public final static native long HRV_Get_Analysis_Result(); // Returns a pointer to a hrv result function, provides all the results from the HRV analysis 
  public final static native void init_hrv_analysis(); // Function to initialise the analysis
  public final static native void hrv_analysis(int jarg1, short jarg2, short jarg3); // Providing the analysis with the data needed

  // Used to load the 'native-lib' library on application startup. Loaded into memory
  static {
    System.loadLibrary("HRV-lib"); //Calling to the SO file, this SO file has the native code for the hrv analysis, native methods
  }
}
//The java code has all the interface interactions with the HRV results, calling it storing it etc, but the hrv_result_t is actually defined in the native SO file code, which will hold all the analysis data