import dayjs, { Dayjs } from 'dayjs';

export function getRemainingTimeUntilMsTimestamp(timestampMS){
    const timestampDayjs = dayjs(timestampMS);
    const nowDayjs= dayjs();
    if(timestampDayjs.isBefore(nowDayjs)) {
        return{
            seconds: '00',
            minutes: '00',
            hours: '00',
            days: '00'
        }
    }
    return{
        seconds: getRamaingSeconds(nowDayjs,timestampDayjs),
        minutes: getRamaingMinutes(nowDayjs,timestampDayjs),
        hours: getRamaingHours(nowDayjs,timestampDayjs),
        days: getRamaingDays(nowDayjs,timestampDayjs)
    }
}

function getRamaingSeconds(nowDayjs, timestampDayjs) {
    const seconds = timestampDayjs.diff(nowDayjs,'seconds') % 60;
    return padWithZeroes(seconds,2)
}

function getRamaingMinutes(nowDayjs, timestampDayjs) {
    const minutes = timestampDayjs.diff(nowDayjs,'minutes') % 60;
    return padWithZeroes(minutes,2)
}

function getRamaingHours(nowDayjs, timestampDayjs) {
    const hours = timestampDayjs.diff(nowDayjs,'hours') % 24;
    return padWithZeroes(hours,2)
}

function getRamaingDays(nowDayjs, timestampDayjs) {
    const days = timestampDayjs.diff(nowDayjs,'days');
    return days.toString();
}

function padWithZeroes(number, minLength){
    const numberString = number.toString();
    if(numberString.length >= minLength) return numberString;
    return "0".repeat(minLength - numberString.length) + numberString;
}