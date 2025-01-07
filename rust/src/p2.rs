pub fn solve() -> i32 {
    let mut sum: i32 = 0;

    let mut i: i32 = 1;
    let mut j: i32 = 1;

    while j < 4000000 {
        sum += if j % 2 == 0 { j } else { 0 };
        let tmp: i32 = j;
        j = i + j;
        i = tmp;
    }

    return sum;
}
